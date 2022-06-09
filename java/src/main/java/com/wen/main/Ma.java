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
        String base = System.getProperty("user.dir");
        String path = base+"\\file\\3.jpg";
        System.out.println(path);
        String knpath=base+"\\KN";
        Ma m = new Ma();
        String distinguish = m.distinguish(path,knpath);
        System.out.println(distinguish);
    }

}
