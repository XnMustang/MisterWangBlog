package com.blog.controller;

import com.blog.entity.Article;
import com.blog.service.IndexService;
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
 * @date :  2020/11/19
 */
@Controller
@RequestMapping("/index")
@Slf4j
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 导航栏-->首页
     * 查询首页所有信息展示：文章、个人介绍、猜你喜欢、点击排行
     * @return 返回首页信息
     */
    @RequestMapping(value = "/index")
    public String toIndex(
            @RequestParam(value = "startPage",defaultValue = "0",required = false) Integer startPage,
            @RequestParam(value = "pageSize",defaultValue = "5",required = false) Integer pageSize,
            Model model){
        List<Article> allInfo = indexService.findAllInfo(startPage,pageSize);
        log.info("logs>>>:" + String.valueOf(allInfo));
        for (Article article : allInfo) {
            System.out.println(article);
        }
        model.addAttribute("allInfo",allInfo);
        return "index";
    }

    /**
     * 导航栏-->分类
     * @return
     */
    @GetMapping(value = "/category")
    public String toCategory(){
        return "category";
    }

    /**
     * 导航栏-->标签墙
     * @return
     */
    @GetMapping(value = "/tag")
    public String toTag(){
        return "tag";
    }

    /**
     * 导航栏-->归档
     * @return
     */
    @GetMapping(value = "/archive")
    public String toArchive(){
        return "archive";
    }

    /**
     * 导航栏-->归档
     * @return
     */
    @GetMapping(value = "/link")
    public String toLink(){
        return "link";
    }

    /**
     * 文章详细
     * @return
     */
    @GetMapping(value = "/article")
    public String toArticle(){
        return "article";
    }

    /**
     * 忘记密码
     * @return
     */
    @GetMapping(value = "/forgetPwd")
    public String toForgetPwd(){
        return "forget-pwd";
    }
}
