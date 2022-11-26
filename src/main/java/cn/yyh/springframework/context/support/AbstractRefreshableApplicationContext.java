package cn.yyh.springframework.context.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.yyh.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author Czycka
 * @date 2022/11/26 16:56
 * @description TODO
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory(){
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
