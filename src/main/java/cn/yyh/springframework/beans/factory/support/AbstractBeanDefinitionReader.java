package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.core.io.DefaultResourceLoader;
import cn.yyh.springframework.core.io.ResourceLoader;

/**
 * @Description TODO
 * @Classname AbstractBeanDefinitionReader
 * @Date 2022/11/25 15:53
 * @Created by 杨耀辉
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
