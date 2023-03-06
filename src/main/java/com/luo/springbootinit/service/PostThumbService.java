package com.luo.springbootinit.service;

import com.luo.springbootinit.model.entity.PostThumb;
import com.luo.springbootinit.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 帖子点赞服务
 *
 * @author <a href="https://github.com/manneia">lkx</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId 帖子Id
     * @param loginUser 当前登录用户
     * @return 返回是否点赞
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId 用户Id
     * @param postId 帖子Id
     * @return 返回点赞
     */
    int doPostThumbInner(long userId, long postId);
}
