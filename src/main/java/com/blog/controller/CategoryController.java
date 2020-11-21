package com.blog.controller;

import com.blog.entity.Article;
import com.blog.entity.Category;
import com.blog.service.CategoryService;
import com.blog.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 分类信息查询
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Controller
@RequestMapping("/category")
@Slf4j
public class CategoryController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询所有文章信息展示，包括分类信息
     * @return
     */
    @GetMapping("/category")
    public String toCategory(Model model){
        List<Article> allInfo = indexService.findAllInfo();
        List<Category> allCategoryInfo = categoryService.findAllCategoryInfo();
        for (Category category : allCategoryInfo) {
            System.out.println(category);
        }
        model.addAttribute("allInfo",allInfo);
        model.addAttribute("allCategoryInfo",allCategoryInfo);
        return "category";
    }

    /**
     * 通过分类的id查询该分类下的所有文章
     * @param model
     * @param id
     */
    @RequestMapping("/categoryArticle")
    public String toCategoryArticle(Model model, @RequestParam("id") Integer id){
        log.info("接收到分类ID:" + id);
        List<Article> allInfo =  categoryService.findCategoryArticle(id);
        List<Category> allCategoryInfo = categoryService.findAllCategoryInfo();
        for (Article article : allInfo) {
            System.out.println(article);
        }
        model.addAttribute("allInfo",allInfo);
        model.addAttribute("allCategoryInfo",allCategoryInfo);
        return "category";
    }

}
