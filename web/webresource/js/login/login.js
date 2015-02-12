$(function () {
    // body...
    $("#loginSubmit").bind("click", function () {
        // body...
        loginValidate();
    })
    $("#loginname").focus();
})
// 输入验证
function loginValidate() {
    // body...
    var loginname = $("#loginname").val();
    var loginpwd = $("#loginpwd").val();
    if (!loginname) {
        layer.msg("请输入登录名");
        $("#loginname").focus();
        return;
    }

    if (!loginpwd) {
        layer.msg("请输入登录密码");
        $("#loginpwd").focus();
        return;
    }
    var actionUrl = "LoginAction";
    var para = {
        loginName:loginname,
        loginPwd:loginpwd
    };
    var loadi = layer.load('加载中…');
    $.ajax({
        type: 'POST',
        url: actionUrl,
        data: para,
        complete: function () {
            layer.close(loadi);
        },
        success: function (data) {
            if(data=="0")
            {
                layer.msg("登录成功")}
        },
        error: function (err) {
            layer.msg("登录出错")
        }
    });
}
