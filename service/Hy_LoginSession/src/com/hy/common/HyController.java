package com.hy.common;


import com.jfinal.core.Controller;

import javax.servlet.http.Cookie;

/**
 * Created by cl on 15/2/4.
 */


public class HyController extends Controller {


    public void setLoginCookie(String value, int maxAgeInSeconds) {
        Cookie cookie = new Cookie("loginName", value);
        cookie.setMaxAge(maxAgeInSeconds);
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        setCookie(cookie);
    }


}
