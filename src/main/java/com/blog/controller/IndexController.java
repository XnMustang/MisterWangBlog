package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/19
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 导航栏-->首页
     * @return
     */
    @GetMapping(value = "/index")
    public String toIndex(){
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
