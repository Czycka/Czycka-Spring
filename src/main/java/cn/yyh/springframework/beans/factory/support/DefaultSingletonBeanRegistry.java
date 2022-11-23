package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.factory.config.SingletonBeanRegister;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description BeanFactory 单例
 * @Classname DefaultSingletonBeanRegistry
 * @Date 2022/11/23 10:08
 * @Created by 杨耀辉
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegister {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

    /**
     * 在 DefaultSingletonBeanRegistry 中主要实现 getSingleton 方法，同时实现了一个受保护的 addSingleton 方法，这个方法可以被继承此类的其他类调用。
     * 包括：AbstractBeanFactory 以及继承的 DefaultListableBeanFactory 调用
     */
}
