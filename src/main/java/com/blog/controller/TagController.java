package com.blog.controller;

import com.blog.entity.Tag;
import com.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/21
 */
@Controller
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping("/tag")
    public void test(){
        List<Tag> allTag = tagService.findAllTag();
        for (Tag tag : allTag) {
            System.out.println(tag);
        }
    }

}
