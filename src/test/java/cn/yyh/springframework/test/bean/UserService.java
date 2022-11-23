package cn.yyh.springframework.test.bean;

/**
 * @Description 用于测试的 bean
 * @Classname UserService
 * @Date 2022/11/23 9:32
 * @Created by 杨耀辉
 */
public class UserService {

    private String name;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + name);
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("").append(name);
        return stringBuffer.toString();

    }
}
