package com.stackroute.MuzixApp.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
    private Object VendorExtension;

    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stackroute"))
                .paths(regex("track.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){


        ApiInfo apiInfo = new ApiInfo(

                "MuzixApp API",
                "Spring boot MuzixApp for your sound tracks",
                "1.0",
                "Terms Of Service",
                "MuzixApp",
                "Apache License Version 2.0",
                "https://www.apache.org/license.html"


        );

        return apiInfo;
    }

}
