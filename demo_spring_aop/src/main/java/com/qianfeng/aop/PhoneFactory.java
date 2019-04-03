package com.qianfeng.aop;


import org.springframework.stereotype.Component;

@Component
public class PhoneFactory  implements  ISalePhoneLicense{
    @Override
    public String salePhone() {
        System.out.println("生产手机");
        return "phone";
    }

    @Override
    public void slaeComputer(String num) {
        System.out.println("生产电脑的台数:  "  + num);
    }
}
