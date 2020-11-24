package com.blog.utils.email;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @Description: 随机生成6位数字作为验证码
 * @Author : 王俊
 * @date :  2020/11/24
 */
@Service
public class RandomVerificationCodeUtil {

    /**
     * 生成6位数字验证码
     * @return
     */
    public Integer emailCode(){
        int mathCode = (int) ((Math.random() * 9 + 1) * 100000);
        return mathCode;
    }
}
