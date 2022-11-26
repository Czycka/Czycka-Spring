package cn.yyh.springframework.beans.factory;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;
import cn.yyh.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Description TODO
 * @Classname ConfigurableBeanFactory
 * @Date 2022/11/25 16:38
 * @Created by 杨耀辉
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
