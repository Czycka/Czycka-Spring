package cn.yyh.springframework.beans.factory.config;

/**
 * @Description 单例注册接口
 * @Classname SingletonBeanRegister
 * @Date 2022/11/23 10:07
 * @Created by 杨耀辉
 */
public interface SingletonBeanRegister {

    // 获取单例对象
    Object getSingleton(String beanName);

}
