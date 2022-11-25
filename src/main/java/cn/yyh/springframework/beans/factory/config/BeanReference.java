package cn.yyh.springframework.beans.factory.config;

import lombok.Getter;

/**
 * @Description Bean 的引用
 * @Classname BeanReference
 * @Date 2022/11/24 9:19
 * @Created by 杨耀辉
 */
@Getter
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
}
