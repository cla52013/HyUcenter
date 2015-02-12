package com.hy.model;

import com.hy.Entity.LoginType;
import com.hy.tool.MD5Util;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

public class HyUserInfo extends Model<HyUserInfo> {
    /**
     *
     */
    public static final HyUserInfo dao = new HyUserInfo();

    // 0 成功
    public int getUserInfo(String uid, String loginPwd) {
        Record user = Db.findFirst(UserConst.GetUserPwd, uid);
        if (user != null) {
            if (user.getColumns().get("Status").toString() == "-1")
            {
                return LoginType.logincancel;//用户已被注销
            }
            String MD5Pwd = user.getColumns().get("MD5pwd").toString();
            String salt = user.getColumns().get("salt").toString();
            String inputPwd = MD5Util.Md5PwdDouble(loginPwd, salt);
            if (inputPwd.equals(MD5Pwd))
                 return  LoginType.success; //用户名密码校验成功
            else
                return  LoginType.loginFial; //用户名密码校验失败
        }
        else {
            return LoginType.notfind;//用户不存在
        }
    }
}
