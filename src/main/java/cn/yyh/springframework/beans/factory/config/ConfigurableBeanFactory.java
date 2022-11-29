package cn.yyh.springframework.beans.factory.config;

import cn.yyh.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author 杨耀辉
 * @Date 2022/11/25 16:34
 * @Description TODO
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    public static String  SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
