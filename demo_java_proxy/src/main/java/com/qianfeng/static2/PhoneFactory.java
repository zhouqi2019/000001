package com.qianfeng.static2;

public class PhoneFactory implements ISalePhoneLicense{
    @Override
    public String salePhone() {
        System.out.println("生产手机");
        return "Phone";
    }
}
