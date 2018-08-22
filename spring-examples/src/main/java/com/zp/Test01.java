package com.zp;

import com.zp.cycle.CircularityA;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {

    public static void main(String[] args) {
      //sprig 入口
        FileSystemXmlApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:test01.xml");

        CircularityA a= (CircularityA)applicationContext.getBean("CircularityA");
        a.a();
        System.out.println("args = [" + a + "]");

    }
}
