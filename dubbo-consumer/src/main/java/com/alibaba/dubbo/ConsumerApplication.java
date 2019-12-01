package com.alibaba.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApplication {
    public static void main(String[] args) {
        System.err.println("consumer start");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

    }
}
