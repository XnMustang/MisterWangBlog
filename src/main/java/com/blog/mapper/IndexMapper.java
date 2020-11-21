package com.blog.mapper;

import com.blog.entity.Article;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 首页信息dao层
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Mapper
@Repository
public interface IndexMapper {

    List<Article> queryAllInfo();

}
