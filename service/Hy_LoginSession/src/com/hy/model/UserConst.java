package com.hy.model;

/**
 * Created by cl on 15/2/6.
 */
public class UserConst {
    public static final  String GetUserPwd="SELECT pwd,LoginName from u_userinfo info LEFT JOIN  u_user_pwd pwd ON info.Uid=pwd.uId where LoginName=? LIMIT 1";
}
