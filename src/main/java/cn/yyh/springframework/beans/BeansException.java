package cn.yyh.springframework.beans;

/**
 * @Description Bean 异常
 * @Classname BeansException
 * @Date 2022/11/23 10:09
 * @Created by 杨耀辉
 */
public class BeansException extends Throwable {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg,cause);
    }
}
