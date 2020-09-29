package com.simplevat.product.config;

import com.simplevat.product.filter.MyFilter;
import com.simplevat.product.filter.MyFilter3;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter3> registrationBean(){
        FilterRegistrationBean<MyFilter3> registrationBean=new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter3());
        registrationBean.addUrlPatterns("/admin/master/product");

        return registrationBean;
    }
}
