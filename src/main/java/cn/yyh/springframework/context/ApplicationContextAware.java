package cn.yyh.springframework.context;

import cn.yyh.springframework.beans.BeansException;
import cn.yyh.springframework.beans.factory.Aware;

/**
 * @author 杨耀辉
 * @date 2022/11/29 9:27
 * @description TODO
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
