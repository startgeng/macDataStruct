package com.kevin.datastruct.mapper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author clg
 */
public class ClgBeanFactoryPostProcess implements BeanFactoryPostProcessor {

    /**
     * 扩展的Spring方法
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition indexService = configurableListableBeanFactory.getBeanDefinition("indexService");
        indexService.setBeanClassName("");
    }
}
