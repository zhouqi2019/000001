package com.qianfeng.dynamic;

public class PhoneFactory implements ISaleAllLicense{
    @Override
    public String saleAll() {
        System.out.println("生产手机");
        return "phone";
    }
}
