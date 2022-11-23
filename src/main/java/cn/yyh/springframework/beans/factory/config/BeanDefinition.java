package cn.yyh.springframework.beans.factory.config;

/**
 * @Description 定义Bean的包装类
 * @Classname BeanDefinition
 * @Date 2022/11/23 9:13
 * @Created by 杨耀辉
 */
public class BeanDefinition {

    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return bean;
    }

    public void setBeanClass(Class bean) {
        this.bean = bean;
    }


}
