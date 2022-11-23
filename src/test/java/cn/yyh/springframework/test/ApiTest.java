package cn.yyh.springframework.test;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;
import cn.yyh.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.yyh.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @Description TODO
 * @Classname ApiTest
 * @Date 2022/11/23 9:34
 * @Created by 杨耀辉
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() throws BeansException {
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        // 3. 获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService","杨耀辉");
        userService.queryUserInfo();
    }
}
