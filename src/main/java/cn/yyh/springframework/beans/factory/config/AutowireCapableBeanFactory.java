package cn.yyh.springframework.beans.factory.config;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.BeanFactory;

/**
 * @Description TODO
 * @Classname AutoWire
 * @Date 2022/11/25 16:32
 * @Created by 杨耀辉
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行 BeanPostProcessor 接口实现类的 postProcessBeforeInitialization 方法
     * @param seistingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object seistingBean,String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessor 接口实现类的 postProcessAfterInitialization 方法
     * @param seistingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object seistingBean,String beanName) throws BeansException;

}
