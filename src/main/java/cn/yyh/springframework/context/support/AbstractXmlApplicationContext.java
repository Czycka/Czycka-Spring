package cn.yyh.springframework.context.support;

import cn.yyh.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.yyh.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author Czycka
 * @date 2022/11/26 17:00
 * @description TODO
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
