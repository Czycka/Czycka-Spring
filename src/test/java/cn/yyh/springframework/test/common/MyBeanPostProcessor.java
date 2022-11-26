package cn.yyh.springframework.test.common;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanPostProcessor;
import cn.yyh.springframework.test.bean.UserService;

/**
 * @author Czycka
 * @date 2022/11/26 18:13
 * @description TODO
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)){
            UserService userService = (UserService) bean;
            userService.setLocation("改为: 北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
