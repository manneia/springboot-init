package com.luo.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 *
 * @author lkx
 * @version 1.0.0
 */
@Data
public class BaseResponse<T> implements Serializable {

    /**
     * 状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 响应信息
     */
    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
