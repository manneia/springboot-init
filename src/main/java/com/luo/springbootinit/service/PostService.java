package com.luo.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.luo.springbootinit.model.dto.post.PostQueryRequest;
import com.luo.springbootinit.model.entity.Post;
import com.luo.springbootinit.model.vo.PostVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 帖子服务
 *
 * @author <a href="https://github.com/manneia">lkx</a>
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param post 待校验参数
     * @param add 添加
     */
    void validPost(Post post, boolean add);

    /**
     * 获取查询条件
     *
     * @param postQueryRequest 查询参数
     * @return 返回查询条件
     */
    QueryWrapper<Post> getQueryWrapper(PostQueryRequest postQueryRequest);

    /**
     * 从 ES 查询
     *
     * @param postQueryRequest 查询参数
     * @return 返回查询结果
     */
    Page<Post> searchFromEs(PostQueryRequest postQueryRequest);

    /**
     * 获取帖子封装
     *
     * @param post 帖子参数
     * @param request http参数
     * @return 返回封装的帖子
     */
    PostVO getPostVO(Post post, HttpServletRequest request);

    /**
     * 分页获取帖子封装
     *
     * @param postPage 帖子页码
     * @param request http参数
     * @return 返回分页的帖子
     */
    Page<PostVO> getPostVOPage(Page<Post> postPage, HttpServletRequest request);
}
