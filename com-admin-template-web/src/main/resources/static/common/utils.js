/**
 * Created by ZSW on 2019/3/4.
 */
var utils = {

};

utils.str = {
    isEmpty:function (str) {
        let s = str == 0 ? str.toString() : str;
        return s == "" || s == null || s == undefined ;
    }
}

utils.array = {
    isEmpty:function (arr) {
        return arr == null || arr == undefined || arr.length <= 0;
    },
    isContain:function (arr, str) {
        if(utils.array.isEmpty(arr)){
            return false;
        }
        if(utils.str.isEmpty(str)){
            return false;
        }
        let r = false;
        for(let x = 0 ; x < arr.length ; x++){
            if(arr[x].toLowerCase() == str.toLowerCase()){
                r = true;
                break;
            }
        }
        return r;
    },
    clone:function (sourceArr) {
        if(this.isEmpty(sourceArr)){
            return;
        }
        let newArr = [];
        for(let x in sourceArr){
            newArr[x] = sourceArr[x];
        }
        return newArr;
    }
};

utils.obj = {
    isEmpty:function (obj) {
        if(obj == null || obj == undefined || obj.length <= 0){
            return true;
        }
        let f = true;
        for(let x in obj){
            let v = obj[x];
            let e = utils.str.isEmpty(v);
            if(!e){
                f = false;
                break;
            }
        }
        return f;
    }

};


utils.file = {
    imageType:[".jpg",".jpeg",".bmp",".gif",".png"],
    imageSize: 10,
    verify:function (option) {
        let type = utils.str.isEmpty(option.type)?this.imageType:option.type;
        let size = utils.str.isEmpty(option.size)?this.imageSize:option.size;
        let file = option.file;
        let fileName = file.name;
        let fileSize = file.size;
        let suffix = fileName.substring(fileName.lastIndexOf("."));
        let r = {
            success:true,
            msg:''
        };
        if(!utils.array.isContain(type,suffix)){
            let msg = "文件不是合法类型，允许的类型为：【"+type+"】";
            r.success = false;
            r.msg = msg;
            return r;
        }
        if(fileSize > size * 1024 * 1024){
            let msg = "不允许上传超过【"+ size/1024/1024 +"MB】的文件";
            r.success = false;
            r.msg = msg;
            return r;
        }
        return r;
    },
};

utils.url = {
    getQueryString:function (name) {
        let reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
        let r = window.location.search.substr(1).match(reg);
        if(r!=null)return  unescape(r[2]); return null;
    },
    encode:function (url) {
        return encodeURI(url);
    }
};

utils.image = {
    /**
     * 计算最大公约数
     * @param x
     * @param y
     * @returns {*}
     */
    algorithm:function(x,y){
        if(x % y){
            return this.algorithm(x,x%y);
        }else{
            return y;
        }
    },
    scale:function (x, y) {
        let convention = this.algorithm(x,y);
        return {x:x/convention,y:y/convention}
    },
    isMatchScale:function(){

    }
}


/**
 * localstore操作工具
 * @type {{get: (function(*=): string), putAll: utils.localstore.putAll, put: utils.localstore.put}}
 */
utils.localstore = {
    put:function (key, value) {
        if(typeof value == "object"){
            value = JSON.stringify(value)
        }
        localStorage.setItem(key,value);
    },
    get:function (key) {
        return localStorage.getItem(key);
    },
    putAll:function (json) {
        for(let x in json){
            utils.localstore.put(x,json[x]);
        }
    }
};

/**
 * json操作
 * @type {{merge: (function(*, *): *), format: {kv: (function(*): string)}}}
 */
utils.json = {
    format:{
        kv:function (json) {
            let str = "";
            for(let x in json){
                let v = json[x];
                if(utils.str.isEmpty(v)){
                    continue;
                }
                str += x + "=" + v + "&";
            }
            str = str.substring(0,str.length - 1);
            return str;
        },
        formData:function (json) {
            let fd = new FormData();
            for(let x in json){
                let value = json[x];
                let type = typeof value;
                if(type == 'object'){
                    if(utils.obj.isEmpty(value)){
                        continue;
                    }
                }else{
                    if(utils.str.isEmpty(value)){
                        continue;
                    }
                }
                fd.append(x,json[x]);
            }
            return fd;
        }
    },
    merge:function (json1, json2) {
        for(let key in json2){
            json1[key] = json2[key];
        }
        return json1;
    },
    removeNull:function (json) {
        let result = {};
        for(let x in json){
            let value = json[x];
            if(utils.str.isEmpty(value)){
                continue;
            }
            result[x] = value;
        }
        return result;
    }
};

/**
 * 时间操作工具
 * @type {{pickerOptions: {shortcuts: *[]}}}
 */
utils.date = {
    pickerOptions: {
        shortcuts: [{
            text: '最近一周',
            onClick(picker) {
                const end = new Date();
                const start = new Date();
                start.setTime(start.getTime() - 3600 * 1000 * 24 * 7);
                picker.$emit('pick', [start, end]);
            }
        }, {
            text: '最近一个月',
            onClick(picker) {
                const end = new Date();
                const start = new Date();
                start.setTime(start.getTime() - 3600 * 1000 * 24 * 30);
                picker.$emit('pick', [start, end]);
            }
        }, {
            text: '最近三个月',
            onClick(picker) {
                const end = new Date();
                const start = new Date();
                start.setTime(start.getTime() - 3600 * 1000 * 24 * 90);
                picker.$emit('pick', [start, end]);
            }
        }]
    },
    currentTimestamp:function () {
        return new Date().getTime();
    },
    dateToString: function(date,fmt){
        if (typeof date === 'string') {
            // 解决IOS上无法从dateStr parse 到Date类型问题
            date = date.replace(/-/g, '/');
        }
        let _date = new Date(date);
        if (/(y+)/.test(fmt)) {
            fmt = fmt.replace(RegExp.$1, (_date.getFullYear() + '').substr(4 - RegExp.$1.length))
        }
        let o = {
            'M+': _date.getMonth() + 1,
            'd+': _date.getDate(),
            'h+': _date.getHours(),
            'm+': _date.getMinutes(),
            's+': _date.getSeconds()
        }
        for (let k in o) {
            if (new RegExp(`(${k})`).test(fmt)) {
                let str = o[k] + ''
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length === 1) ? str : padLeftZero(str))
            }
        }
        function padLeftZero(str) {
            return ('00' + str).substr(str.length)
        }
        return fmt;
    },
};

/**
 * 分页操作
 * @type {{total: number, totalPage: number, pageSize: number, currentPage: number}}
 */
utils.page = {
    pageSize:10,
    pageSizeArr:[10, 15, 20,25],
    currentPage:1,
    total:10,
    totalPage:10,
};


/**
 * 正则处理
 * @type {{tel_regexp: RegExp, idcard_regexp: RegExp, idcard: utils.reg.idcard, mobile: utils.reg.mobile}}
 */
utils.reg = {
    tel_regexp :/^1([38]\d|5[0-35-9]|7[3678])\d{8}$/,
    idcard_regexp : /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/,
    mobile:function (str) {
        if(utils.str.isEmpty(str)){
            return false;
        }
        return this.tel_regexp.test(str);
    },
    idcard:function (str) {
        if(utils.str.isEmpty(str)){
            return false;
        }
        return this.idcard_regexp.test(str);
    }
};


utils.city = {
    _name:'',
    init:function () {
        let data = [];
        request.getJsonAsync(api.city.listByParent(),{parentId:0},function (resp) {
            data = resp.data;
        });
        return data;
    },
    listByParent:function (parentId) {
        let children = [];
        request.getJsonAsync(api.city.listByParent(),{parentId:parentId},function (resp) {
            children = resp.data;
        });
        return children;
    },
    setChild:function(id,data,children) {
        for(let x in data){
            let d = data[x];
            if(d.id == id){
                d.children = children;
                return
            }else{
                if(d.hasChildren == 1){
                    let c = d.children;
                    this.setChild(id,c,children);
                }
            }
        }
    },
    getLabelArr:function(idArr,data){
        let label = [];
        for(let x in idArr){
            this._name = "";
            let l = this.getLabelDetail(idArr[x],data);
            label.push(l);
        }
        return label;
    },
    getLabel:function(idArr,data){
        let label = "";
        for(let x in idArr){
            this._name = "";
            let l = this.getLabelDetail(idArr[x],data);
            label += l;
        }
        return label;
    },
    getLabelDetail:function (val,data) {
        for(let x in data){
            if(!utils.str.isEmpty(this._name)){
                return this._name;
            }
            let d = data[x];
            if(val == d.id) {
                this._name = d.name;
                return this._name;
            }else if(d.hasChildren == 1){
                this.getLabelDetail(val,d.children);
            }
        }
    },
    bean:{
        country:'',
        province:'',
        city:'',
        region:''
    },
    props: {
        label: 'name',
        value: 'id',
        children: 'children'
    }
};


utils.wangEditor = {
    init:function (editorId,toolbarId,imgType,imgDir) {
        let container = document.getElementById(editorId);
        let toolbar = document.getElementById(toolbarId);
        let E = window.wangEditor;
        let editor = new E(toolbar, container);  // 两个参数也可以传入 elem 对象，class 选择器
        // let editor = new wangEditor(container);
        editor.customConfig.uploadImgServer = '/admin/edit/image?type='+imgType+'&imgDir='+imgDir;  // 上传图片到服务器
        // 3M
        editor.customConfig.uploadImgMaxSize = 3 * 1024 * 1024;
        // 限制一次最多上传 5 张图片
        editor.customConfig.uploadImgMaxLength = 1;
        // 自定义文件名
        editor.customConfig.uploadFileName = 'file';
        // 将 timeout 时间改为 3s
        editor.customConfig.uploadImgTimeout = 5000;
        editor.customConfig.menuFixed = true;
        editor.customConfig.uploadImgHooks = {
            before: function (xhr, editor, files) {
            },
            success: function (xhr, editor, result) {
            },
            fail: function (xhr, editor, result) {
            },
            error: function (xhr, editor) {
            },
            customInsert: function (insertImg, result, editor) {
                let url = result.data;
                insertImg(url);
            }
        };
        editor.create();
        return editor;
    }
};

utils.dictionary = {
    list:function (type) {
        let data = null;
        request.getJsonAsync(api.dictionary.listByParent(),{type:type},function (resp) {
            if(resp.success){
                data = resp.data;
            }
        });
        return data;
    },
    activity:function () {
        return this.list(1);
    },
    delegation:function () {
        return this.list(2);
    },
    news:function () {
        return this.list(3);
    },
    source:function () {
        return this.list(4);
    },
    genealogy:function () {
        return this.list(5);
    },
    celebrity:function () {
        return this.list(6);
    },
    dynasty:function () {
        return this.list(7);
    },
    crowdfunding:function () {
        return this.list(9);
    }
};

/**
 * 银行
 * @type {{list: utils.bank.list}}
 */
utils.bank = {
    list:function () {
        let data = null;
        request.getJsonAsync(api.bank.list(),{},function (resp) {
            data = resp.data;
        });
        return data;
    }
};




