package cn.yyh.springframework.test.bean;

import lombok.Data;

/**
 * @Description 用于测试的 bean
 * @Classname UserService
 * @Date 2022/11/23 9:32
 * @Created by 杨耀辉
 */
@Data
public class UserService {

    private String uId;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryUserName(uId));
    }
}
