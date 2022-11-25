package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;

/**
 * @Description 对象注册接口
 * @Classname BeanDefinitionRegistry
 * @Date 2022/11/23 10:08
 * @Created by 杨耀辉
 */
public interface BeanDefinitionRegistry {

    /**
     * 向表中注册 beanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用 Bean 名称查询 BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的 BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    boolean containsBeanDefinition(String beanName) throws BeansException;

    /**
     * 返回注册表内所有的 Bean 的名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
