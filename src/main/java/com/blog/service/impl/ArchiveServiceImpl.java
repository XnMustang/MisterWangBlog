package com.blog.service.impl;

import com.blog.entity.Archive;
import com.blog.mapper.ArchiveMapper;
import com.blog.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Service
public class ArchiveServiceImpl implements ArchiveService {

    @Autowired
    private ArchiveMapper archiveMapper;

    @Override
    public List<Archive> findAllArchive() {
        return archiveMapper.queryAllArchive();
    }
}
