package com.luo.springbootinit.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lkx
 * @version 1.0.0
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 6695007651118935184L;

    private String userAccount;

    private String userPassword;
}
