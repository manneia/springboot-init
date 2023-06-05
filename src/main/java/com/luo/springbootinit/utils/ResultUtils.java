package com.luo.springbootinit.utils;

import com.luo.springbootinit.common.BaseResponse;
import com.luo.springbootinit.common.ErrorCode;

/**
 * 返回结果封装类
 *
 * @author lkx
 * @version 1.0.0
 */
public class ResultUtils {
    /**
     * 成功返回结果*
     *
     * @param data 返回的数据
     * @param <T>  返回数据的类型
     * @return 返回一个响应封装对象
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误对象
     * @return 返回一个响应封装对象
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败返回结果
     *
     * @param code    错误码
     * @param message 错误消息
     * @return 返回一个响应封装对象
     */
    public static <T> BaseResponse<T> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误对象
     * @return 返回一个响应封装对象
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}
