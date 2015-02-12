package com.hy.model;

/**
 * Created by cl on 15/2/6.
 */
public class UserConst {
    public static final  String GetUserPwd="SELECT pwd,MD5pwd,salt,Status from u_userinfo info " +
            "INNER JOIN  u_user_pwd pwd ON info.Uid=pwd.uId where loginName=? LIMIT 1";

}
