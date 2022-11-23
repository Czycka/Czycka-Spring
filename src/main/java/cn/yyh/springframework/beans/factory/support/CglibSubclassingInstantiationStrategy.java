package cn.yyh.springframework.beans.factory.support;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @Description 使用 Cglib 带参实例化对象
 * @Classname CglibSubclassingInstantiationStrategy
 * @Date 2022/11/23 11:46
 * @Created by 杨耀辉
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        // 若构造函数不存在 则使用系统默认的无参构造
        if (null == ctor) return enhancer.create();
        // 实例化对象
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
