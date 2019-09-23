package com.github.mitonize.mayaaintegrationtest;

import javax.servlet.http.HttpServlet;

import org.seasar.mayaa.impl.MayaaServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean    
    public ServletRegistrationBean<HttpServlet> mayaaServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new MayaaServlet());
        servRegBean.addUrlMappings("*.html");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
} 
