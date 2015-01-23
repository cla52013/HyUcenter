package com.hy.service.common;

import com.hy.service.controller.IndexController;
import com.hy.service.model.HyUserInfo;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
public class UcenterConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	public void configRoute(Routes me) {
		me.add("/", IndexController.class);
	}

	public void configPlugin(Plugins me) {
		//连接串
		C3p0Plugin cp = new C3p0Plugin("jdbc:mysql://mysql.hysoft.org/hy_ucenter",
				"hyUcenter", "zDFfCzp9zVGHsCVZ");
		me.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
		me.add(arp);
		//表映射关系
		arp.addMapping("u_userinfo","Uid",HyUserInfo.class);
		//arp.addMapping("article", "article_id", Article.class);
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}