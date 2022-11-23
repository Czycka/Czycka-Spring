package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 简单实例化
 * @Classname SimpleInstantiationStrategy
 * @Date 2022/11/23 11:29
 * @Created by 杨耀辉
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            // 判断是否存在带参构造器
            if (null != ctor) {
                // 存在带参构造器 则传入参数 实例化对象
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }else{
                // 不存在带参构造器 直接调用无参构造
                return clazz.getDeclaredConstructor().newInstance();
            }
        }catch (NoSuchMethodException|InstantiationException|IllegalAccessException| InvocationTargetException e){
            throw new BeansException("failed to instantiate ["+clazz.getName()+"]",e);
        }
    }
}
