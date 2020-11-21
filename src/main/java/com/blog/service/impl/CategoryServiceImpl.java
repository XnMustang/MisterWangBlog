package com.blog.service.impl;

import com.blog.entity.Archive;
import com.blog.entity.Article;
import com.blog.entity.Category;
import com.blog.mapper.CategoryMapper;
import com.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAllCategoryInfo() {
        return categoryMapper.queryCategoryAllInfo();
    }

    @Override
    public List<Article> findCategoryArticle(Integer id) {
        return categoryMapper.queryCategoryArticle(id);
    }
}
