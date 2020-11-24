package com.blog.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.blog.utils.email.SendEmailUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.crypto.interfaces.PBEKey;

/**
 * @Description: 注册
 * @Author : 王俊
 * @date :  2020/11/19
 */
@Controller
@RequestMapping("/register")
@Slf4j
public class RegisterController {

    @Autowired
    private SendEmailUtil sendEmailUtil;

    @GetMapping(value = "/")
    public String register(){
        return "register";
    }

    @RequestMapping("/userRegisterToEmail")
    @ResponseBody
    public void registerSendEmail(@RequestParam("to_email") String toEmail){
        log.info("获取到的前端邮箱：" + toEmail);
        Integer code = sendEmailUtil.sendTxtEmail();
        System.out.println("随机生成的验证码：" + code);
    }

}
