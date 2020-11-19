package com.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 登录博客系统
 * @Author : 王俊
 * @date :  2020/11/18
 */
@Controller
@Slf4j
public class LoginController {

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

}
