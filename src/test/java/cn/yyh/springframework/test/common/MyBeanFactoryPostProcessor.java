package cn.yyh.springframework.test.common;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.PropertyValue;
import cn.yyh.springframework.beans.PropertyValues;
import cn.yyh.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;
import cn.yyh.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author Czycka
 * @date 2022/11/26 18:11
 * @description TODO
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company","改为: 字节跳动"));
    }
}
