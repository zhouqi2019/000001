package com.qianfeng.static2;

public class ComputerFactory implements ISaleComputerLicense{
    @Override
    public String saleComputer() {
        System.out.println("生产电脑");
        return "computer";
    }
}
