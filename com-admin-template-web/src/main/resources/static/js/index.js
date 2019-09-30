/**
 * Created by ZSW on 2019/2/27.
 */
var vm = new Vue({
    el: '#app',
    data: {
        visible: false,
        isCollapse: false,
        userInfo:{
            name:"admin"
        },
        menus:[
            {
                id:1,
                name:'一级',
                icon:"el-icon-menu",
                children:[
                    {
                        id:2,
                        name:"dashboard",
                        url:"/?view="
                    },
                    {
                        id:3,
                        name:"子级二",
                        url:"/?view="
                    },
                    {
                        id:4,
                        name:"子级三",
                        url:'https://github.com/'
                    },
                ]
            },
            {
                id:5,
                name:'二级',
                icon:"el-icon-location",
                children:[
                    {
                        id:6,
                        name:"子级一"
                    },
                    {
                        id:7,
                        name:"子级二"
                    },
                    {
                        id:8,
                        name:"子级三"
                    },
                ]
            },
        ],
        crumb:{
            name:'首页',
            url:'https://www.baidu.com'
        }
    },
    mounted(){
    },
    methods: {
        handleOpen(key, keyPath) {
            console.log(key, keyPath);
        },
        handleClose(key, keyPath) {
            console.log(key, keyPath);
        },
        skip(t){
            $("#Loading").show();
            var attrs = t.$attrs
            var url = attrs.url;
            var page_box=document.getElementById("iframe")
            page_box.setAttribute("src",url);
            vm.crumb = attrs;
        },
        getAllParent(currentId){

        }
    }
});
var iframe = document.getElementById("iframe");
iframe.onload = function(){
    $("#Loading").hide();
};
