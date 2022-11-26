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
    private String company;
    private String location;
    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + ",公司: " + company + ",地点: " + location;
    }
}
