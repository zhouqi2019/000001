package com.qianfeng;


import org.springframework.stereotype.Component;

@Component
public class GreenTeaWater implements  IWater{

    @Override
    public String getName() {
        return "coffee";
    }
}
