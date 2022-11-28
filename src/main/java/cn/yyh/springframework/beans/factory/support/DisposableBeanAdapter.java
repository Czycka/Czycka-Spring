package cn.yyh.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.DisposableBean;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * @author DisposableBeanAdapter
 * @date 2022/11/28 14:02
 * @description TODO
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;
    private final String beanName;
    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        // 1. 实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // 2. 配置信息 destroy-method (判断是为了避免第二次执行销毁)
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with bean '" + beanName + "'");
            }
        }
    }
}
