package com.zp;

import com.zp.aspect.Test01Def;
import com.zp.cycle.CircularityA;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {

    public static void main(String[] args) {
      //sprig 入口
        FileSystemXmlApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:aspect.xml");

        Test01Def a= (Test01Def)applicationContext.getBean("test01Def");
        a.hello("zhang");
        System.out.println("args = [" + a + "]");

    }
}
