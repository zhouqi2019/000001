package com.qianfeng.coffee;

import com.qianfeng.ioc.IWater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component("coffee")
public class CoffeeWater implements IWater {

    @Autowired
    private Random random;
    @Override
    public String getName() {
        System.out.println("water:" + random);
        return "咖啡" + random.nextInt();
    }
}
