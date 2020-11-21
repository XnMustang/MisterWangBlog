package com.blog.controller;

import com.blog.entity.Archive;
import com.blog.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description: 归档信息统计
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Controller
@RequestMapping("/archive")
public class ArchiveController {

    @Autowired
    private ArchiveService archiveService;

    @GetMapping("/archive")
    public String toArchive(Model model){
        List<Archive> allArchive = archiveService.findAllArchive();
        model.addAttribute("allArchive",allArchive);
        return "archive";
    }

}
