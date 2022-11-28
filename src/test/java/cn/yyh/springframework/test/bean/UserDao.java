package cn.yyh.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 模拟数据库
 * @Classname UserDao
 * @Date 2022/11/24 9:33
 * @Created by 杨耀辉
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行: init-method");
        hashMap.put("1001", "小杨哥");
        hashMap.put("1002", "小牛哥");
        hashMap.put("1003", "小马哥");
    }

    public void destroyDataMethod(){
        System.out.println("执行: destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }



}
