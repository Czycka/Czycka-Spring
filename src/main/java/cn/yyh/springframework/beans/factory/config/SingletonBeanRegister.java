package cn.yyh.springframework.beans.factory.config;

/**
 * @author 杨耀辉
 * @Date 2022/11/23 10:07
 * @Description 单例注册接口
 */
public interface SingletonBeanRegister {

    /**
     * 获取单例对象
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
