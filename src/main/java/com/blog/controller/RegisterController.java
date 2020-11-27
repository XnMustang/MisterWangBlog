package com.blog.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.blog.entity.Result;
import com.blog.utils.BaseResponse;
import com.blog.utils.StatusCode;
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

    //邮箱生成的验证码
    private Integer oldEmailCode = 0;

    @GetMapping(value = "/")
    public String register(){
        return "register";
    }

    /**
     * 注册时发送邮件
     * @param toEmail 用户输入的邮箱
     * @return 返回状态码
     */
    @RequestMapping("/userRegisterToEmail")
    @ResponseBody
    public BaseResponse registerSendEmail(@RequestParam("to_email") String toEmail){
        log.info("获取到的前端邮箱：" + toEmail);
        oldEmailCode = sendEmailUtil.sendTxtEmail();
        log.info("生成的验证码：" + oldEmailCode);
        BaseResponse response = new BaseResponse(StatusCode.Success);
        System.out.println(response);
        return response;
    }

    @RequestMapping("/register")
    @ResponseBody
    public BaseResponse register(String username,String password,String ackPassword,String email,Integer emailCode){
        log.info("用户名：" + username + ",密码：" + password +",确认密码：" + ackPassword+",邮箱：" + email+",验证码：" + emailCode);
        /**
         * 判断用户注册时输入的验证码和邮件发送的验证码是否一致
         */
        if(emailCode.equals(oldEmailCode)){
            log.info("验证码正确！");
        }else {
            log.info("验证码错误！");
        }
        BaseResponse baseResponse = new BaseResponse(StatusCode.Success);
        System.out.println(baseResponse.getCode());
        return baseResponse;
    }

}
