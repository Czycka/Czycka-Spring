package cn.yyh.springframework.beans.factory;

import cn.yyh.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Description TODO
 * @Classname ListableBeanFactory
 * @Date 2022/11/25 16:43
 * @Created by 杨耀辉
 */
public interface ListableBeanFactory extends BeanFactory {
    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> Map<String,T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有 Bean 名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
