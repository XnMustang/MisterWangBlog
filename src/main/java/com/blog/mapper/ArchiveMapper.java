package com.blog.mapper;

import com.blog.entity.Archive;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 归档dao
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Mapper
@Repository
public interface ArchiveMapper {

    List<Archive> queryAllArchive();

}
