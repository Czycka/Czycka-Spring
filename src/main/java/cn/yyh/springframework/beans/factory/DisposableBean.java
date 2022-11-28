package cn.yyh.springframework.beans.factory;

/**
 * @author DisposableBean
 * @date 2022/11/28 9:30
 * @description TODO
 */
public interface DisposableBean {
    /**
     * 销毁方法
     * @throws Exception
     */
    void destroy() throws Exception;

}