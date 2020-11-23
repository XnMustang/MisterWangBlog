package com.blog.controller;

import com.blog.entity.Archive;
import com.blog.service.ArchiveService;
import com.blog.utils.map.LinkedMultiValueMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

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

        LinkedMultiValueMap<String,Archive> multiValueMap = new LinkedMultiValueMap<>();

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
//                listMap.add(archive);
                multiValueMap.add(archiveTime,archive);
                log.info("存在key，存储完成！");
            }else {
                log.info("还没有存在这个key：" + archiveTime);
                map.put(archiveTime,countArchive);
                //归档存储到list中
//                listMap.add(archive);
                //list存储到map集合
                multiValueMap.add(archiveTime,archive);
                log.info("不存在key，存储完成！");
            }
        }
        log.info("---->>打印统计归档信息的map<<------");
        for(Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println("key:" + m.getKey() + ",value:" + m.getValue());
        }

        log.info("+++++++++++打印可重复存储value的map集合信息：++++++");
        Iterator iterator = multiValueMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("KEY>>:" + entry.getKey() + ",VALUE>>:" + entry.getValue());
        }
        model.addAttribute("multiValueMap",multiValueMap);
        model.addAttribute("map",map);
        return "archive";
    }

}
