package com.blog.utils.email;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/24
 */
@Slf4j
@Service
public class SendEmailUtil {

    @Autowired
    private JavaMailSenderImpl mailSender;

    @Autowired
    private RandomVerificationCodeUtil verificationCodeUtil;

    /**
     * 发送验证码  经测试：验证码发送时间约为22秒
     * @return
     */
    public Integer sendTxtEmail(){
        Integer emailCode = verificationCodeUtil.emailCode();
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //设置收件人
        mailMessage.setTo(new String("1617171230@qq.com"));
        //设置寄件人
        mailMessage.setFrom("forward_xn@163.com");
        //邮件标题
        mailMessage.setSubject("欢迎注册 [王先生博客] ");
        //邮件内容
        mailMessage.setText("您好！验证码为："+ emailCode +"，用于<王先生博客>注册用户使用，5分钟有效。");
        //发送邮件
        mailSender.send(mailMessage);
        log.info("邮件发送成功！");
        return emailCode;
    }

}
