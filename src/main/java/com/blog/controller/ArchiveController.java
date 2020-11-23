package com.blog.controller;

import com.blog.entity.Archive;
import com.blog.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @ResponseBody
    public void toArchive(Model model){
        List<Archive> allArchive = archiveService.findAllArchive();
        Map<String,List<Archive>> map = new HashMap<>();
        String archiveTime = null;
        //key存储的是年月份，如果重复就让该key的value中再存储一条archive
        for (Archive archive : allArchive) {
            archiveTime = archive.getYear()+"年"+archive.getMonth()+"月";
            map.put(archiveTime, (List<Archive>) archive);
        }


        List<String> timeList = new ArrayList<>();
        model.addAttribute("allArchive",allArchive);
        String yearMonth = null;
        for (Archive archive : allArchive) {
            //year=2019, month=10, day=03, articleTitle=Java基础总结, articleId=1002
            /**
             * 2019年 12月 3 篇
             *      12-05栈和队列
             *      12-15图解数据结构
             *      12-28算法入门
             */
            yearMonth = archive.getYear() +"年"+ archive.getMonth()+"月";
            for (String time : timeList) {
                if(yearMonth.equals(time)){

                }
            }
            timeList.add(yearMonth);

            System.out.println(archive);
        }
        for (String s : timeList) {
            System.out.println(s);
        }
    }

}
