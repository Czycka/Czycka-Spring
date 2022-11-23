package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.factory.config.BeanDefinition;

/**
 * @Description 对象注册接口
 * @Classname BeanDefinitionRegistry
 * @Date 2022/11/23 10:08
 * @Created by 杨耀辉
 */
public interface BeanDefinitionRegistry {

    // 注册 bean
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
