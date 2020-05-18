package com.genpact.library.genpact.library.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.genpact.library.genpact.library.management.controller"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(metaData());
        }
	
	 private ApiInfo metaData() {
	       return new ApiInfoBuilder().title("Genpact").description("Genpact interview process API")
	    		   .contact(new springfox.documentation.service.Contact("Nallathambi", "sample.com", "nallathambi.a98@gmail.com"))
	    		   .version("1.0.1").build();
	    		   
	    }

}
