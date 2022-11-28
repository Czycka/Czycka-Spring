package cn.yyh.springframework.beans.factory.config;

import cn.yyh.springframework.beans.PropertyValues;
import lombok.Data;

/**
 * @author 杨耀辉
 * @Date 2022/11/23 9:13
 * @Description 定义Bean的包装类
 */
@Data
public class BeanDefinition {

    private Class beanClass;

    private String scope;

    private PropertyValues propertyValues;

    private String initMethodName;

    private String destroyMethodName;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }
}
