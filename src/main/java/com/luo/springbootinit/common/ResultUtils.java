package com.luo.springbootinit.common;

/**
 * 返回工具类
 *
 * @author <a href="https://github.com/manneia">lkx</a>
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data 成功的对象
     * @param <T> 成功的对象的类型
     * @return 返回成功的对象
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 返回错误对象
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code 失败码
     * @param message 错误信息
     * @return 返回错误信息
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 返回错误对象
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
