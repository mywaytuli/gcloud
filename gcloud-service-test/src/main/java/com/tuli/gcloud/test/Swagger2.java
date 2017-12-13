package com.tuli.gcloud.test;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by c_yangmingming-002 on 2017/12/6.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Swagger2.class);

    @Value("${swagger2.package}")
    private String basePackage;

    @Value("${spring.application.name}")
    private String title;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact=new Contact("tuli",
                "https://github.com/mywaytuli/gcloud.git","myway.tuli@gmail.com");

        return new ApiInfoBuilder()
                .title(title + " RESTful APIs")
                .description(title + " RESTful API详情!")
                .contact(contact)
                .version("1.0.0")
                .build();
    }

    private static class Logger {
    }
}
