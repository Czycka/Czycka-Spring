package cn.yyh.springframework.test.bean;

import cn.yyh.springframework.beans.factory.DisposableBean;
import cn.yyh.springframework.beans.factory.InitializingBean;
import lombok.Data;

/**
 * @Description 用于测试的 bean
 * @Classname UserService
 * @Date 2022/11/23 9:32
 * @Created by 杨耀辉
 */
@Data
public class UserService implements InitializingBean, DisposableBean {

    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    @Override
    public void destroy() throws Exception {
        System.out.println("执行方法: UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行方法: UserService.afterPropertiesSet");
    }

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + ",公司: " + company + ",地点: " + location;
    }
}
