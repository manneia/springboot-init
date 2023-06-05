package com.luo.springbootinit.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lkx
 * @version 1.0.0
 */
@Data
public class UserAddRequest implements Serializable {

    private static final long serialVersionUID = -8538815811789252435L;
    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 用户角色: user, admin
     */
    private String userRole;

    /**
     * 密码
     */
    private String userPassword;
}
