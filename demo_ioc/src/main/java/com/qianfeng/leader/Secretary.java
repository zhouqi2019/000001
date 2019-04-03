package com.qianfeng.leader;


import com.qianfeng.leader.annotation.Need;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 秘书
 */
public class Secretary {

    public static <T> T inject(Class<T> clazz){


        T leader = null;
        try {
            leader = clazz.newInstance();
            Method[] methods = clazz.getMethods();
            for (Method method:methods) {
                //获取方法上的need注解
                Need need = method.getAnnotation(Need.class);
                if (need != null) {
                    Class teaClazz = need.value();
                    Object tea = teaClazz.newInstance();
                    method.invoke(leader,tea);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return leader;


    }
}