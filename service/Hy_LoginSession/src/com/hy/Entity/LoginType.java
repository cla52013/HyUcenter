package com.hy.Entity;

/**
 * Created by cl on 15/2/11.
 */
public class LoginType {
    //登录成功
    public static final int success = 0;//

    public static final int notfind = 1;//
    /**
     * 用户名或密码错误
     * */
    public static final int loginFial = 2;//
    /**
     * 用户已被注销
     * */
    public static final int logincancel = 3;//
    /**
     * 账号风险稍后再试
     * */
    public static final int loginwait = 4;//
    /**
     * 账号锁定
     */
    public static final int loginLock = 5;
}
