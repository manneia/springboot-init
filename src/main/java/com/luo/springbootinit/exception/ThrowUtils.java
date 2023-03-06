package com.luo.springbootinit.exception;

import com.luo.springbootinit.common.ErrorCode;

/**
 * 抛异常工具类
 *
 * @author <a href="https://github.com/manneia">lkx</a>
 */
public class ThrowUtils {

    /**
     * 条件成立则抛异常
     *
     * @param condition 错误条件
     * @param runtimeException 返回异常参数
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition
     * @param errorCode
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition
     * @param errorCode
     * @param message
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }
}
