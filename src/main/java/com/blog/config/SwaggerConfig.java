package com.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 点进源码查看得出参数内容
     * 配置Swagger的Docket的Bean实例
     * @return
     */
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }
    //配置Swagger信息
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("王俊", "www.forward.cool", "forward_xn@163.com");

        return new ApiInfo(
                "Blog的SwaggerAPI",
                "Springboot整合Swagger",
                "v1.0",
                "www.forward.cool",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
