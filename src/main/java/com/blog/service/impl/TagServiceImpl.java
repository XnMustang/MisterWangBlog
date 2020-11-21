package com.blog.service.impl;

import com.blog.entity.Article;
import com.blog.entity.Tag;
import com.blog.mapper.TagMapper;
import com.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/21
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> findAllTag() {
        return tagMapper.queryAllTag();
    }

    @Override
    public List<Article> findTagArticle(Integer id) {
        return tagMapper.queryTagArticle(id);
    }
}
