package com.alibaba.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApplication {

    public static void main(String[] args){
        System.err.println("服务已经启动...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.err.println(context.getDisplayName() + ": here");
        context.start();
        System.err.println("服务已经启动...");
    }
}
