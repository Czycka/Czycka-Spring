package cn.yyh.springframework.beans.factory;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description 用于创建Bean
 * @Classname BeanFactory
 * @Date 2022/11/23 9:12
 * @Created by 杨耀辉
 */
public interface BeanFactory {

    // 获取 Bean 对象
    Object getBean(String name) throws BeansException;
    Object getBean(String name,Object...args) throws BeansException;
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
