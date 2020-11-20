package com.blog.service;

import com.blog.entity.Article;

import java.util.List;

/**
 * @Description: 首页信息展示接口
 * @Author : 王俊
 * @date :  2020/11/20
 */

public interface IndexService {

    /**
     * 查询首页所有信息
     * @return
     */
    List<Article> findAllInfo();

}
