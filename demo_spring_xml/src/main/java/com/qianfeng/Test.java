package com.qianfeng;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //完成Spring.xml文件的解析和Spring容器的初始化
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        MaLeader leader = applicationContext.getBean(MaLeader.class);
        System.out.println(leader.getWater().getName());
    }
}
