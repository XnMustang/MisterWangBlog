package com.blog.controller;

import com.blog.entity.Archive;
import com.blog.service.ArchiveService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ArchiveController {

    @Autowired
    private ArchiveService archiveService;

    @GetMapping("/archive")
    public String toArchive(Model model){
        List<Archive> allArchive = archiveService.findAllArchive();
        Map<String,Integer> map = new HashMap<>();
        String archiveTime = "";  //拼接年份和月份
        int countArchive = 1;
        log.info("打印归档查询信息：");
        for (Archive archive : allArchive) {
            log.info(archive.toString());
            archiveTime = archive.getYear() + "年" +archive.getMonth() + "月";
            //判断是否存在这个年月份，如果存在，就让这个年月份+1，用来统计月份文章数
            if(map.containsKey(archiveTime)){
                log.debug("已经存在这个key");
                countArchive = countArchive + 1;
                map.put(archiveTime,countArchive);
                log.info("存在key，存储完成！");
            }else {
                log.info("还没有存在这个key：" + archiveTime);
                map.put(archiveTime,countArchive);
            }
        }
        for(Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println("key:" + m.getKey() + ",value:" + m.getValue());
        }
        model.addAttribute("allArchive",allArchive);
        model.addAttribute("map",map);
        return "archive";
    }

}
