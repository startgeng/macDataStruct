package com.kevin.datastruct.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 陈立庚
 */
public class ReflectSample {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.kevin.datastruct.reflect.Robot");
        Field[] fields = clazz.getFields();
        Robot robot = (Robot) clazz.newInstance();
        System.out.println(clazz.getName());
        Method method = clazz.getDeclaredMethod("throwHello", String.class);
        method.setAccessible(true);
        Object str = method.invoke(robot, "陈立庚");
        System.out.println("调用成功"+"getHello"+str);

        //getMethod能获取继承的方法
        Method clazzMethod = clazz.getMethod("sayHi");
        clazzMethod.invoke(robot);
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot,"立庚");
    }
}
