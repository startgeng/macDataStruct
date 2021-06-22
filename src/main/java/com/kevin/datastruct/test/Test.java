package com.kevin.datastruct.test;

import com.kevin.datastruct.app.Appconfig;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenligeng
 */
public class Test {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);

        //获取的是List<String> 里面的东西
//        ac.getBeanDefinitionNames();
//
//        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//        beanDefinition.setBeanClassName("aaa");
//        beanDefinition.setParentName("aabb");
//        beanDefinition.setDependsOn("aa");
//        beanDefinition.setLazyInit(true);
//        beanDefinition.setPrimary(true);
//        beanDefinition.setDescription("aaa");
//        ac.getBean("");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> collect = list.stream().filter(e -> e.equals(2)).collect(Collectors.toList());
        System.out.println(collect.toString());
        System.out.println(list.toString());
        List<Boolean> collect1 = list.stream().map(e -> {
            return e.equals(2);
        }).collect(Collectors.toList());
        System.out.println(collect1.toString());
        System.out.println(list.toString());
    }


}
