package cn.yyh.springframework.beans.factory.config;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author Czycka
 * @date 2022/11/26 15:33
 * @description TODO
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
