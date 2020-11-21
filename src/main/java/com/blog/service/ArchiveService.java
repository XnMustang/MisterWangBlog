package com.blog.service;

import com.blog.entity.Archive;

import java.util.List;

/**
 * @Description: 归档业务接口
 * @Author : 王俊
 * @date :  2020/11/20
 */

public interface ArchiveService {

    /**
     * 查询所有归档信息，并做处理
     * @return
     */
    List<Archive> findAllArchive();

}
