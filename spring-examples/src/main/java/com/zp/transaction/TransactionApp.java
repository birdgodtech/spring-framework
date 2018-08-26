package com.zp.transaction;

import com.zp.aspect.Test01Def;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TransactionApp {

    public static void main(String[] args) {
        //sprig 入口
        FileSystemXmlApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:transaction.xml");

        TransactionTest02 transactionTest02= (TransactionTest02)applicationContext.getBean("transactionTest02");
         int i=transactionTest02.insertTestTbale();
        System.out.println("result = [" + i + "]");

    }
}
