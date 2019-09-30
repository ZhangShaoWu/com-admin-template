/**
 * Created by ZSW on 2019/9/30.
 */

const confirm = {};



confirm.remove = function (confirmFun,cancelFun) {
    confirm.warning("确认删除？",confirmFun,cancelFun);
};

confirm.warning = function (content,confirmFun,cancelFun) {
    vm.$confirm(content, '提示', {
        confirmButtonText: '确认',
        cancelButtonText: '取消',
        type: 'warning'
    }).then((resp) => {
        if(confirmFun){
            confirmFun(resp);
        }
    }).catch((resp) => {
        if(cancelFun){
            cancelFun(resp);
        }
    });
};

confirm.prompt = function (title,reg,errMsg,confirmFun,cancelFun) {
    vm.$prompt(title, '提示', {
        confirmButtonText: '确认',
        cancelButtonText: '取消',
        inputPattern: reg,
        inputErrorMessage: errMsg
    }).then(({ value }) => {
        if(confirmFun){
            confirmFun(value);
        }
    }).catch(() => {
        if(cancelFun){
            cancelFun();
        }
    });
};