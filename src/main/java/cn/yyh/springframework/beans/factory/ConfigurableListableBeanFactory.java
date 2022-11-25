package cn.yyh.springframework.beans.factory;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.AutoWireCapableBeanFactory;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;
import cn.yyh.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Description TODO
 * @Classname ConfigurableBeanFactory
 * @Date 2022/11/25 16:38
 * @Created by 杨耀辉
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutoWireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
