package cn.yyh.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description TODO
 * @Classname DefaultResourceLoader
 * @Date 2022/11/25 15:46
 * @Created by 杨耀辉
 */
public class DefaultResourceLoader implements ResourceLoader{
    @Override
    public Resource getResource(String location) {
        Assert.notNull(location,"Location must not be null");
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        }else{
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            }catch (MalformedURLException e){
                return new FileSystemResource(location);
            }
        }
    }
}
