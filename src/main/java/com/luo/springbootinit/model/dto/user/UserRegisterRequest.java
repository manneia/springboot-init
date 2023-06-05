package com.luo.springbootinit.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author lkx
 * @version 1.0.0
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3835692642104776801L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

}
