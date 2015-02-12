package com.hy.tool;


import java.security.MessageDigest;

/**
 * Created by cl on 15/2/11.
 */
public class MD5Util {

    public final static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //两次md5 先将密码加密一次 再加上salt加密一次
    public  final  static  String Md5PwdDouble(String pwd,String salt)
    {
        return MD5(MD5(pwd)+salt);
    }
    //一次md5+
    public  final  static  String Md5Pwd(String md5Pwd,String salt)
    {
        return  MD5(md5Pwd+salt);
    }
}
