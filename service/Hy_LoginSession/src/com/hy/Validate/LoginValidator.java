package com.hy.Validate;

import com.hy.model.HyUserInfo;
import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

/**
 * Created by cl on 15/2/3.
 */

public class LoginValidator extends Validator {

    //验证数据
    @Override
    protected void validate(Controller c) {
        validateRequiredString("HyUserInfo.loginName", "loginnameMsg", "请输入登录名");
    }

    @Override
    protected void handleError(Controller c) {
        c.keepModel(HyUserInfo.class);

        String actionKey = getActionKey();
        if (actionKey.equals("/blog/save"))
            c.render("add.html");
        else if (actionKey.equals("/blog/update"))
            c.render("edit.html");
    }
}

