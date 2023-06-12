package com.example.demo.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
/*
    @Autowired
    MyCounterInterceptor myCounterInterceptor;
    public void addInterceptors(InterceptorRegistry registry){
        registry.addWebRequestInterceptor(myCounterInterceptor);
    }

 */
}