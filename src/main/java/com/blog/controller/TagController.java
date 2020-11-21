package com.blog.controller;

import com.blog.entity.Article;
import com.blog.entity.Category;
import com.blog.entity.Tag;
import com.blog.service.CategoryService;
import com.blog.service.IndexService;
import com.blog.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/21
 */
@Controller
@RequestMapping("/tag")
@Slf4j
public class TagController {

    @Autowired
    private TagService tagService;

    @Autowired
    private IndexService indexService;

    /**
     * 查询标签墙左侧标签展示，并统计
     */
    @GetMapping("/tag")
    public String toTag(Model model){
        List<Tag> tagList = tagService.findAllTag();
        List<Article> allInfo = indexService.findAllInfo();
        for (Article article : allInfo) {
            System.out.println(article);
        }
        model.addAttribute("tagList",tagList);
        model.addAttribute("allInfo",allInfo);
        return "tag";
    }

    /**
     * 查询标签墙右侧主体数据-->文章简单信息展示
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/tagArticle")
    public String toTagArticle(Model model, @RequestParam("id") Integer id){
        log.info("接收到的标签ID:" + id);
        //首先查询根据传来的标签id查询出右侧文章数据
        List<Article> allInfo = tagService.findTagArticle(id);
        //然后查询左侧标签栏
        List<Tag> tagList = tagService.findAllTag();
        model.addAttribute("tagList",tagList);
        model.addAttribute("allInfo",allInfo);
        return "tag";
    }




}
