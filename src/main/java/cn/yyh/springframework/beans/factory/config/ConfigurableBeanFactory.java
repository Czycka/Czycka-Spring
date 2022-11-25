package cn.yyh.springframework.beans.factory.config;

import cn.yyh.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Description TODO
 * @Classname ConfigurableBeanFactory
 * @Date 2022/11/25 16:34
 * @Created by 杨耀辉
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegister {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}
