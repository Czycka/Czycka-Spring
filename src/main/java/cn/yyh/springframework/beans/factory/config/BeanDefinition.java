package cn.yyh.springframework.beans.factory.config;

import cn.yyh.springframework.beans.PropertyValues;
import lombok.Data;

/**
 * @Description 定义Bean的包装类
 * @Classname BeanDefinition
 * @Date 2022/11/23 9:13
 * @Created by 杨耀辉
 */
@Data
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }
}
