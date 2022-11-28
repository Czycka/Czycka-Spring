package cn.yyh.springframework.beans.factory;

import cn.yyh.springframework.beans.BeansException;

/**
 * @author 杨耀辉
 * @date 2022/11/28 17:49
 * @description TODO
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
