package cn.yyh.springframework.context.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanPostProcessor;
import cn.yyh.springframework.context.ApplicationContext;
import cn.yyh.springframework.context.ApplicationContextAware;

/**
 * @author 杨耀辉
 * @date 2022/11/29 9:29
 * @description TODO
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
