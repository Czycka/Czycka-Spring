package cn.yyh.springframework.test.bean;

import cn.yyh.springframework.beans.factory.*;
import cn.yyh.springframework.context.ApplicationContext;
import cn.yyh.springframework.context.ApplicationContextAware;
import lombok.Data;

/**
 * @Description 用于测试的 bean
 * @Classname UserService
 * @Date 2022/11/23 9:32
 * @Created by 杨耀辉
 */
@Data
public class UserService
//        implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware,InitializingBean, DisposableBean
{

//    private ApplicationContext applicationContext;
//
//    private BeanFactory beanFactory;

    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + ",公司: " + company + ",地点: " + location;
    }


//    @Override
//    public void destroy() throws Exception {
//        System.out.println("执行方法: UserService.destroy");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("执行方法: UserService.afterPropertiesSet");
//    }
//    @Override
//    public void setBeanClassLoader(ClassLoader classLoader) {
//        System.out.println("ClassLoader：" + classLoader);
//    }
//
//    @Override
//    public void setBeanName(String name) {
//        System.out.println("Bean Name is：" + name);
//    }
}
