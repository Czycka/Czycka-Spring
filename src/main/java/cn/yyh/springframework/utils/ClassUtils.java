package cn.yyh.springframework.utils;

/**
 * @Description TODO
 * @Classname ClassUtils
 * @Date 2022/11/25 16:46
 * @Created by 杨耀辉
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader(){
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }catch (Throwable ex){
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null){
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}
