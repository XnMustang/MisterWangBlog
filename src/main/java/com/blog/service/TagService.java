package com.blog.service;

import com.blog.entity.Article;
import com.blog.entity.Tag;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/21
 */
public interface TagService {

    /**
     * 查询标签强左侧信息展示
     * @return
     */
    List<Tag> findAllTag();

    /**
     * 查询标签墙右侧主体内容
     * @param id
     * @return
     */
    List<Article> findTagArticle(Integer id);
}
