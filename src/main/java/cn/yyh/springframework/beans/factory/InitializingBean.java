package cn.yyh.springframework.beans.factory;

/**
 * @Description 初始化方法接口
 * @Classname InitializingBean
 * @Date 2022/11/28 9:24
 * @Created by 杨耀辉
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
