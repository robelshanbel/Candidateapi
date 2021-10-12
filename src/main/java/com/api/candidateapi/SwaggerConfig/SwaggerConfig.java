package com.api.candidateapi.SwaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())
                .select()

                .apis(RequestHandlerSelectors.basePackage("com.api.candidateapi.Controller"))

                .build();

    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Candidate API")
                .description("Candidate API reference ")
                .termsOfServiceUrl("robel_shanbel@yahoo.com")
                .contact("Robel Shanbel")
                .version("1.0")
                .build();
    }

}



