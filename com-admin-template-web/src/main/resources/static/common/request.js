/**
 * Created by ZSW on 2019/9/30.
 */
/**
 * Created by ZSW on 2019/2/28.
 */
$.ajaxSetup({
    headers:{
        "AdminAuthentication":localStorage.getItem("token")
        // "UserAuthentication":'b73f3f7d316c449baff574b1ce277994'
    }
});


const request = {};
/**
 * json异步请求（post）
 * @param url
 * @param data
 * @param cb
 */
request.postJson = function (url, data, cb) {
    let param = null;
    if(data instanceof Array){
        param = []
        data.map(e=>{
            let d = utils.json.removeNull(e);
        param.push(d);
    })
    }else{
        param = utils.json.removeNull(data);
    }
    $.ajax({
        url:url,
        type:"post",
        dataType:"json",
        contentType:"application/json; charset=utf-8",
        data:JSON.stringify(param),
        traditional:true,
        success:function(resp){
            if(!resp.success){
                msg.error(resp.msg);
                if(resp.code == 401){
                    if (window != top){
                        top.location.href = "login";
                        return;
                    }
                }

            }
            cb(resp);
        }
    });
};

/**
 * formdata异步请求（post）
 * @param url
 * @param data
 * @param cb
 */
request.postForm = function (url, data, cb) {
    let param = null;
    if(data instanceof FormData){
        param = data;
    }else{
        param = utils.json.format.formData(data);
    }
    $.ajax({
        url:url,
        type:"post",
        processData: false,
        contentType: false,
        data:param,
        success:function(resp){
            if(!resp.success){
                msg.error(resp.msg);
                if(resp.code == 401){
                    if (window != top){
                        top.location.href = "login";
                        return;
                    }
                }
            }
            cb(resp);
        }
    });
};

/**
 * json异步（get）
 * @param url
 * @param data
 * @param cb
 */
request.getJson = function (url, data, cb) {
    data = utils.json.removeNull(data);
    $.ajax({
        type:"GET",
        url:url,
        data:utils.json.format.kv(data),
        success:function(resp){
            if(!resp.success){
                msg.error(resp.msg);
                if(resp.code == 401){
                    if (window != top){
                        top.location.href = config.LOGIN_PAGE;
                        return;
                    }
                }
            }
            cb(resp);
        }
    });
};

/**
 * json同步（get）
 * @param url
 * @param data
 * @param cb
 */
request.getJsonAsync = function (url, data, cb) {
    data = utils.json.removeNull(data);
    $.ajax({
        type:"GET",
        async:false,
        url:url,
        data:utils.json.format.kv(data),
        success:function(resp){
            if(!resp.success){
                msg.error(resp.msg);
                if(resp.code == 401){
                    if (window != top){
                        top.location.href = config.LOGIN_PAGE;
                        return;
                    }
                }
            }
            cb(resp);
        }
    });
};

/**
 * 下载
 * @param url
 */
request.downLoad = function (url,data) {
    let a = document.createElement("a");
    if(utils.obj.isEmpty(data)){
        a.setAttribute("href",url);
    }else{
        a.setAttribute("href",url+"?"+utils.json.format.kv(data));
    }
    a.click();
}