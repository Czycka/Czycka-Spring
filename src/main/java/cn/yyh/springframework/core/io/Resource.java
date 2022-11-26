package cn.yyh.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description 资源接口
 * @Classname Resource
 * @Date 2022/11/25 10:35
 * @Created by 杨耀辉
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
