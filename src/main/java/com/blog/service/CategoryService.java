package com.blog.service;

import com.blog.entity.Category;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/20
 */
public interface CategoryService {

    /**
     * 统计分类-->左侧分类明细
     * @return
     */
    List<Category> findAllCategoryInfo();

}
