package cn.yyh.springframework.context.support;

import cn.yyh.springframework.beans.BeansException;

/**
 * @author Czycka
 * @date 2022/11/26 17:04
 * @description TODO
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {
    }

    /**
     * 从 XML 中加载 BeanDefinition, 并刷新上下文
     *
     * @param configLocation
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String configLocation) throws BeansException {
        this(new String[]{configLocation});
    }

    /**
     * 从 XML 中加载 BeanDefinition, 并刷新上下文
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        // 刷新容器
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
