package com.blog.mapper;

import com.blog.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/21
 */
@Mapper
@Repository
public interface TagMapper {

    List<Tag> queryAll();
}
