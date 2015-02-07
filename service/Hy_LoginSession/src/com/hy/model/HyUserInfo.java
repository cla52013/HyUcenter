package com.hy.model;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

public class HyUserInfo extends Model<HyUserInfo> {
    /**
     *
     */
    public static final HyUserInfo dao = new HyUserInfo();

    public boolean getUserInfo(String loginname,String loginPwd) {
        Record user = Db.findFirst(UserConst.GetUserPwd, loginname);

        String pwd= user.getColumns().get("pwd").toString();

        if(loginPwd.equals(pwd))
        {
            return true;
        }
        return false;
    }
}
