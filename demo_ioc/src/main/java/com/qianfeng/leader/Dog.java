package com.qianfeng.leader;

public class Dog {

    private IWater water;

    /**
     * 喂水
     * @param water
     */

    public void feedWater(IWater water){
        this.water = water;
    }
}
