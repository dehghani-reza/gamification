package com.gamification.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.w3c.dom.DocumentType;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collection;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket swaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .paths(PathSelectors.ant("/person/*"))
                .apis(RequestHandlerSelectors.basePackage("com.gamification.core.controllers"))
                .build()
                .apiInfo(apiInfoDetails());
    }

    private ApiInfo apiInfoDetails() {
        ApiInfo apiInfo = new ApiInfo("gamification",
                "This is a feature of scrume methology APIs",
                "1.0",
                "127.0.0.1:9092",
                new Contact("gami fication",
                        "http:\\gamification2023.ir",
                        "gamification2023@gmail.com"),
                "API licence",
                "http:\\gamification2023.ir",
                Collections.emptyList());
        return apiInfo;
    }

}
