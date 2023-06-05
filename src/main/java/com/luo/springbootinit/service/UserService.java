package com.luo.springbootinit.service;

import com.luo.springbootinit.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lkx
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2023-06-01 09:20:45
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   账户名
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 返回用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户名
     * @param userPassword 密码
     * @param request      请求信息
     * @return 返回脱敏的用户对象
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request 请求信息
     * @return 返回脱敏的用户对象
     */
    User getCurrentLoginUser(HttpServletRequest request);

    /**
     * 是否为管理员
     *
     * @param request 请求信息
     * @return 返回 true 或 false
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request 请求信息
     * @return 返回 true 或 false
     */
    boolean userLogout(HttpServletRequest request);
}
