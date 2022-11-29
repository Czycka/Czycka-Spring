package cn.yyh.springframework.beans.factory;

/**
 * @author 杨耀辉
 * @date 2022/11/29 13:52
 * @description TODO
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;
    Class<?> getObjectType();
    boolean isSingleton();
}
