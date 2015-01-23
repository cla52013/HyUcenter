package com.hy.service;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
	public void index() {
		renderText("<a href='http://www.baidu.com'>跳转</a>");
	}
}