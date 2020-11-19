package com.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 错误页面
 * @Author : 王俊
 * @date :  2020/11/18
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置静态资源映射
        registry.addResourceHandler("/article/**").addResourceLocations("classpath:/static/");
        //配置静态资源文件路径
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        //配置模板页面的路径 如果配置文件中已经配置，此处就不再需要配置
        //registry.addResourceHandler("/template/**").addResourceLocations("classpath:/static/");
    }
}
