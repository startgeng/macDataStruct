package com.kevin.datastruct.test;

import com.kevin.datastruct.app.Appconfig;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenligeng
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);

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
        ac.getBean("");

    }
}
