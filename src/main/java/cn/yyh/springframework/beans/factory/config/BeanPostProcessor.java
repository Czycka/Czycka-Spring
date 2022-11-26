package cn.yyh.springframework.beans.factory.config;

import cn.yyh.springframework.beans.BeansException;

/**
 * @author Czycka
 * @date 2022/11/26 17:39
 * @description TODO
 */
public interface BeanPostProcessor {

    /**
     * 在 bean 对象执行初始化方法之前,执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException;

    /**
     * 在 bean 对象执行初始化方法之后,执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException;

}
