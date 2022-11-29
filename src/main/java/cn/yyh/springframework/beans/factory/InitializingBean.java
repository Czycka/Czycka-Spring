package cn.yyh.springframework.beans.factory;

/**
 * @author 杨耀辉
 * @Date 2022/11/28 9:24
 * @Description 初始化方法接口
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
