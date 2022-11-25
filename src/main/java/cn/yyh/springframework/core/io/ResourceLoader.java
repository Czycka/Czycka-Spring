package cn.yyh.springframework.core.io;

/**
 * @Description TODO
 * @Classname ResourceLoader
 * @Date 2022/11/25 15:43
 * @Created by 杨耀辉
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
