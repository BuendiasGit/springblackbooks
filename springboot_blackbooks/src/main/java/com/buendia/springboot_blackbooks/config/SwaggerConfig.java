package com.buendia.springboot_blackbooks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //创建文档说明
    public ApiInfo createAI(){
        ApiInfo apiInfo = new ApiInfoBuilder().title("springboot实现书籍").description("书籍小程序的后端接口").
                contact(new Contact("buendia","","buendia@foxemil.com")).build();
        return apiInfo;
    }

    //创建swagger扫描信息
    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().
                apis(RequestHandlerSelectors.basePackage("com.buendia.springboot_blackbooks.books.controller")).build();
    }

}
