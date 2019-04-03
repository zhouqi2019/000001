package com.qianfeng;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring的入口类.@Configuration注解定义当前类的入口类
@Configuration
//SpringConfiguration扫描下面的类
@ComponentScan("com.qianfeng")
public class SpringConfiguration {
}
