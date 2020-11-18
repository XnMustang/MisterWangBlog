package com.wang.blog.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: druid连接池配置类
 * @Author : 王俊
 * @date :  2020/11/18
 */
@Configuration
@ConditionalOnClass(DruidDataSource.class)
@ConditionalOnProperty(name = "spring.dataSource.type", havingValue = "com.alibaba.druid.pool.DruidDataSource", matchIfMissing = true)
@Slf4j
public class DruidDataSourceConfig {

    @Value("${druidUsername}")
    private String druidUsername;
    @Value("${druidPassword}")
    private String druidPassword;

    /**
     * 配置Druid监控的StatViewServlet和WebStatFilter
     */
    @Bean
    public ServletRegistrationBean druidServlet(){
        log.info("init Druid Servlet Configuration ");
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<String, String>();
        initParameters.put("loginUsername", druidUsername);
        initParameters.put("loginPassword", druidPassword);
        initParameters.put("resetEnable", "true");
        //下面是黑白名单，多个ip地址之间用逗号隔开
//      initParameters.put("allow", "119.23.202.55,127.0.0.1,10.24.38.152");
//      initParameters.put("deny", "119.23.202.55");
        servletRegistrationBean.setInitParameters(initParameters);

        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
