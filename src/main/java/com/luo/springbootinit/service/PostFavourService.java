package com.luo.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.luo.springbootinit.model.entity.Post;
import com.luo.springbootinit.model.entity.PostFavour;
import com.luo.springbootinit.model.entity.User;

/**
 * 帖子收藏服务
 *
 * @author <a href="https://github.com/manneia">lkx</a>
 */
public interface PostFavourService extends IService<PostFavour> {

    /**
     * 帖子收藏
     *
     * @param postId 帖子Id
     * @param loginUser 当前登录用户
     * @return 返回是否收藏
     */
    int doPostFavour(long postId, User loginUser);

    /**
     * 分页获取用户收藏的帖子列表
     *
     * @param page 页码
     * @param queryWrapper 查询条件
     * @param favourUserId 当前用户Id
     * @return 返回用户收藏的帖子列表
     */
    Page<Post> listFavourPostByPage(IPage<Post> page, Wrapper<Post> queryWrapper,
                                    long favourUserId);

    /**
     * 帖子收藏（内部服务）
     *
     * @param userId 用户Id
     * @param postId 帖子Id
     * @return 返回是否收藏
     */
    int doPostFavourInner(long userId, long postId);
}
