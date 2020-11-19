package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.crypto.interfaces.PBEKey;

/**
 * @Description: 注册
 * @Author : 王俊
 * @date :  2020/11/19
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @GetMapping(value = "/register")
    public String register(){
        return "register";
    }

}
