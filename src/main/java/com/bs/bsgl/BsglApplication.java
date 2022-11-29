package com.bs.bsgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class BsglApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(BsglApplication.class, args);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/assets/css/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/assets/css/");
        registry.addResourceHandler("/static/assets/js/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/assets/js/");
        super.addResourceHandlers(registry);
    }

}
