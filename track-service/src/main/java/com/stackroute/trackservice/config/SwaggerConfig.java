package com.stackroute.trackservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2//this annotation enables SWagger support configuration automatically
public class SwaggerConfig {


    /**
     * @return
     * select()  returns an ApiSelectorBuilder this also provieds apis and patths methods
     * paths()acts as an additional filter to generate documentation only for the path starting with /api/v1
     *pass this following url to open generated documentation rendered by swaggerr
     * link----http://localhost:8080/swagger-ui.html
     *
     * for rendering docs pass  the below link to the browser
     * http://localhost:8080/v2/api-docs
     */
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()                 .apis(RequestHandlerSelectors.basePackage("com.stackroute.trackservice.controller"))
                .paths(regex("/api/v1/.*"))
                .build();
    }
}
