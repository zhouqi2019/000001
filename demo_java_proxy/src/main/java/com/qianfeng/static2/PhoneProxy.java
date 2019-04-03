package com.qianfeng.static2;

public class PhoneProxy implements ISalePhoneLicense,ISaleComputerLicense{

    private void beforSale(){
        System.out.println("售前服务");
    }

    private void saling(){
        System.out.println("售中回访服务");
    }

    private void afterSale(){
        System.out.println("售后服务");
    }


    /**
     * 卖电脑
     * @return
     */

    @Override
    public String saleComputer() {

        //售前
        beforSale();

        //售中
        saling();

        //从工厂进货
        String computer = new ComputerFactory().saleComputer();

        //售后
        afterSale();

        return computer;
    }

    @Override
    public String salePhone() {

        //售前
        beforSale();

        //售中
        saling();

        //从工厂进货
        String phone = new PhoneFactory().salePhone();

        //售后
        afterSale();

        return phone;
    }
}
