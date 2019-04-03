package com.qianfeng;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        //创建秘书对象也就是初始化Spring容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MaLeader leader = applicationContext.getBean(MaLeader.class);
        System.out.println(leader.getiWater().getName());
    }
}
