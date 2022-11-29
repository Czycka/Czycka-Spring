package cn.yyh.springframework.beans.factory;

/**
 * @author 杨耀辉
 * @date 2022/11/29 9:24
 * @description TODO
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);

}