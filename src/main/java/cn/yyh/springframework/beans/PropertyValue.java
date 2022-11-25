package cn.yyh.springframework.beans;

import lombok.Getter;

/**
 * @Description TODO
 * @Classname PropertyValue
 * @Date 2022/11/23 19:58
 * @Created by 杨耀辉
 */

@Getter
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }
}
