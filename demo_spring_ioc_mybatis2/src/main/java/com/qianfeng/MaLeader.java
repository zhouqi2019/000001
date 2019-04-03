package com.qianfeng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 创建了一个领导类用来给秘书提供需要
 */
//只有加了@Component注解的类,才能够被秘书 SpringIoC才会服务(管理)
@Component
public class MaLeader {
    private IWater iWater;


    //Autowired自动注入
    //类似@need(value=xxx.class)
    @Autowired
    public void setiWater(IWater iWater){
        this.iWater = iWater;
    }

    public IWater getiWater() {
        return iWater;
    }
}
