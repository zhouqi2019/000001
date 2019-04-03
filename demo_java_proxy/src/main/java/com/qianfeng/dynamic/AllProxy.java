package com.qianfeng.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AllProxy implements InvocationHandler {

    //动态代理   代理的是有相同营业执照的工厂
    private ISaleAllLicense factory;

    //参数:实现了ISaleAllLicense营业执照工厂对象
    public AllProxy(ISaleAllLicense factory){
        this.factory = factory;
    }

    private void beforeService(){
        System.out.println("售前服务");
    }

    private void afterService(){
        System.out.println("售后服务");
    }

    private void saling(){
        System.out.println("售中回访服务");
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //售前
        beforeService();

        //售中
        saling();

        //参数1:被代理的工厂对象
        Object invoke = method.invoke(factory, args);

        //售后
        afterService();
        return invoke;
    }
}
