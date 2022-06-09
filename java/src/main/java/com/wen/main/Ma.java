package com.wen.main;

import java.io.UnsupportedEncodingException;

;

public class Ma {
    static{
        System.loadLibrary("distinguish");
    }
    public  native String distinguish(String datapath,String knpath);
    public  native void test();


    public static void main(String[] paramArrayOfString) throws UnsupportedEncodingException {
        String path = "e:\\2\\3.jpg";
        String knpath=System.getProperty("user.dir")+"\\KN";
        Ma m = new Ma();
        String distinguish = m.distinguish(path,knpath);
        System.out.println(distinguish);
    }

}
