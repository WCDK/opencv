package com.wen.main;

public class Ma {
    static{
        System.loadLibrary("distinguish");
    }
    public  native String distinguish(String datapath,String knpath);
    public  native void test();


    public static void main(String[] paramArrayOfString) {

        String base = System.getProperty("user.dir");
        String path = base+"\\file\\3.jpg";
        String knpath=base+"\\KN";
        Ma m = new Ma();
//        m.test();
        String distinguish = m.distinguish(path,knpath);
        System.out.println(distinguish);
    }

}
