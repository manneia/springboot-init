package com.luo.springbootinit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限校验
 *
 * @author lkx
 * @version 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {
    /**
     * 有任何一个角色
     *
     * @return  返回true表示有权限执行该方法，false表示没有权限执行该方法
     */
    String[] anyRole() default "";

    /**
     * 必须有某个角色
     *
     * @return 返回true表示有权限执行该方法，false表示没有权限执行该方法
     */
    String mustRole() default "";
}
