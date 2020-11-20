package com.blog.mapper;

import com.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Mapper
@Repository
public interface CategoryMapper {

    List<Category> queryCategoryAllInfo();

}
