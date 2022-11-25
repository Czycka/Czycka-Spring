package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.core.io.Resource;
import cn.yyh.springframework.core.io.ResourceLoader;

/**
 * @Description TODO
 * @Classname BeanDefinitionReader
 * @Date 2022/11/25 15:50
 * @Created by 杨耀辉
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
