package com.zp;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {

    public static void main(String[] args) {
      //sprig 入口
        FileSystemXmlApplicationContext applicationContext=new FileSystemXmlApplicationContext("test01.xml");

    }
}
