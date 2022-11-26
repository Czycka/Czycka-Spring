package cn.yyh.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.PropertyValue;
import cn.yyh.springframework.beans.PropertyValues;
import cn.yyh.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;
import cn.yyh.springframework.beans.factory.config.BeanPostProcessor;
import cn.yyh.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * @Description 创建实例抽象类
 * @Classname AbstractAutowireCapableBeanFactory
 * @Date 2022/11/23 10:08
 * @Created by 杨耀辉
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory implements AutowireCapableBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition,beanName,args);
            // 给 Bean 填充属性
            applyPropertyValues(beanName,bean,beanDefinition);
            // 执行 Bean 的初始化方法和 BeanPostProcessor 的前置和后置处理方法
            bean = initializeBean(beanName,bean,beanDefinition);
        }catch (Exception e){
            throw new BeansException("Instantiation of bean failed",e);
        }

        addSingleton(beanName,bean);
        return bean;
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

    private Object initializeBean(String beanName,Object bean, BeanDefinition beanDefinition){
        // 1. 执行 BeanPostProcessor Before 处理
        Object wrappedBean = applyBeanPostProcessorsBeforeInitialization(bean,beanName);

        // 待完成内容: invokeInitMethods(beanName, wrappedBean,beanDefinition);
        invokeInitMethods(beanName, wrappedBean,beanDefinition);

        // 2. 执行 BeanPostProcessor After 处理
        wrappedBean = applyBeanPostProcessorsAfterInitialization(bean,beanName);
        return wrappedBean;
    }

    private void invokeInitMethods(String beanName,Object wrappedBean, BeanDefinition beanDefinition){

    }

    @Override
    public Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName)throws BeansException{
        Object result = existingBean;
        for (BeanPostProcessor processor :
                getBeanPostProcessors()) {
            Object current = processor.postProcessBeforeInitialization(result, beanName);
            if (null == current) return result;
            result = current;
        }
        return result;
    }

    @Override
    public Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException{
        Object result =existingBean;
        for (BeanPostProcessor processor :
                getBeanPostProcessors()) {
            Object current = processor.postProcessAfterInitialization(result, beanName);
            if (null == current) return result;
            result = current;
        }
        return result;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) throws BeansException {
        Constructor constructorToUse = null;
        // 获取到 Bean 的 Class
        Class<?> beanClass = beanDefinition.getBeanClass();
        // 获取 Bean 全部的构造方法
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            // 循环 暂时只以参数数量匹配构造方法
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    /**
     * Bean 属性填充
     */
    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();

            if (propertyValues != null) {
                for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {

                    String name = propertyValue.getName();
                    Object value = propertyValue.getValue();

                    if (value instanceof BeanReference) {
                        // A 依赖 B 获取 B 的实例化;
                        BeanReference beanReference = (BeanReference) value;
                        value = getBean(beanReference.getBeanName());
                    }
                    // 属性填充
                    BeanUtil.setFieldValue(bean, name, value);
                }
            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values：" + beanName);
        }
    }
}
