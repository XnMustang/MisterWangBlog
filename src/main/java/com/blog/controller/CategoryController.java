package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 分类信息查询
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    /**
     * 查询所有文章信息展示，包括分类信息
     * @return
     */
    @GetMapping("/category")
    public String toCategory(Model model){


        return null;
    }

}
