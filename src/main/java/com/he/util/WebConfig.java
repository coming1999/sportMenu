package com.he.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Kris He
 * @date 2021/12/12 19:06
 * 全局配置类--配置跨域请求
 **/
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    /**
     * 1.域的访问路径
     * 2.域的请求来源
     * 3.方法
     * 4.允许携带信息
     * 5。最大响应时间
     * @param registry
     */
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("Http://localhost:8080","null")
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
