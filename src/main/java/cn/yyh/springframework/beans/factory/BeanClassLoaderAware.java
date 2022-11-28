package cn.yyh.springframework.beans.factory;

/**
 * @author 杨耀辉
 * @date 2022/11/28 17:51
 * @description TODO
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}
