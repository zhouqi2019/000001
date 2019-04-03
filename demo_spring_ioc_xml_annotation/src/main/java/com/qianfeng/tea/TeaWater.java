package com.qianfeng.tea;

import com.qianfeng.ioc.IWater;
import org.springframework.stereotype.Component;


@Component
public class TeaWater implements IWater {
    @Override
    public String getName() {
        return "茶";
    }
}
