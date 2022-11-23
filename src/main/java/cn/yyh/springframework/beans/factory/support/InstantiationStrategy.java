package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Description Cglib 实例化策略接口
 * @Classname InstantiationStrategy
 * @Date 2022/11/23 11:27
 * @Created by 杨耀辉
 */
public interface InstantiationStrategy {

    // 实例化对象
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args) throws BeansException;

}
