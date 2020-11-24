package com.blog.service.impl;

import com.blog.entity.Article;
import com.blog.mapper.IndexMapper;
import com.blog.service.IndexService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 首页接口实现类
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public List<Article> findAllInfo(Integer startPage,Integer pageSize) {
        return indexMapper.queryAllInfo(startPage,pageSize);
    }
}
