package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.BeanFactory;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;

/**
 * @Description Bean 工厂抽象类
 * @Classname AbstractBeanFactory
 * @Date 2022/11/23 10:08
 * @Created by 杨耀辉
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name,null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name,args);
    }

    protected <T> T doGetBean(final String name,final Object[] args) throws BeansException {
        Object bean = getSingleton(name);
        // 判断单例库内是否存在该 Bean
        if (bean != null) {
            // 存在则直接返回
            return (T) bean;
        }
        // 获取 Bean 的定义类
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name,beanDefinition,args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
