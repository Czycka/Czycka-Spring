package cn.yyh.springframework.context;

import cn.yyh.springframework.beans.BeansException;

/**
 * @author Czycka
 * @date 2022/11/26 16:33
 * @description TODO
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    /**
     * 注册虚拟机钩子
     */
    void registerShutdownHook();

    /**
     * 手动关闭
     */
    void close();

}
