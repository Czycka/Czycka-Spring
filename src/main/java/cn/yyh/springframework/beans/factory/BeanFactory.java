package cn.yyh.springframework.beans.factory;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 杨耀辉
 * @Date 2022/11/23 9:12
 * @Description BeanFactory 的基类
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
    Object getBean(String name,Object...args) throws BeansException;
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
