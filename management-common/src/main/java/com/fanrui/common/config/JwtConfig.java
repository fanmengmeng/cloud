package com.fanrui.common.config;

import com.fanrui.common.filter.JwtFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        // 添加过滤器
        registrationBean.setFilter(new JwtFilter());
        // 设置过滤器过滤的地址
        registrationBean.addUrlPatterns("/secure/*");

        return registrationBean;
    }
}
