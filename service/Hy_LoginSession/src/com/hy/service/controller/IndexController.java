package com.hy.service.controller;

import com.hy.service.model.HyUserInfo;
import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		HyUserInfo userinfo=HyUserInfo.dao.findById(1);
		renderText("<a href='http://www.baidu.com'>跳转</a>"+userinfo.get("LoginName"));
	}
}
