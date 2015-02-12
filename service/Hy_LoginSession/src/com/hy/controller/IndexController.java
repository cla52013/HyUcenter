package com.hy.controller;

import com.hy.model.HyUserInfo;
import com.hy.common.HyController;

public class IndexController extends HyController {
    //默认首页
    public void index() {
        HyUserInfo userinfo = HyUserInfo.dao.findById(1);
        render("Index.html");

        //renderHtml("<a href='http://www.baidu.com'>跳转</a>"+userinfo.getStr("LoginName"));
    }


    public void LoginAction() {
        String loginName = getPara("loginName");
        String loginPwd = getPara("loginPwd");


        int logCheck = HyUserInfo.dao.getUserInfo(loginName, loginPwd);
        if (logCheck==0) {
            setLoginCookie(loginName, 60 * 60);
        }
        renderJson(logCheck);
    }
}

