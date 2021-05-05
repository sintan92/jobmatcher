package com.example.jobmatcher.demo.Config;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.awt.print.Pageable;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static springfox.documentation.builders.PathSelectors.regex;
/*
@Configuration
@EnableSwagger2
//@PropertySource({"classpath:application.properties"})
//@ConditionalOnResource(resources = {"classpath:application.properties"})
public class SwaggerConfiguration {

    public static final String DEFAULT_INCLUDE_PATTERN = "/api/.*";
    public static final String AUTHORIZATION_HEADER = "X-JWT-Assertion";
    private final Logger log = LoggerFactory.getLogger(SwaggerConfiguration.class);

    @Bean
    public Docket api() {
        // @formatter:off
        //Register the controllers to swagger
        //Also it is configuring the Swagger Docket
        return new Docket(DocumentationType.SWAGGER_2).select()
                // .apis(RequestHandlerSelectors.any())
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                // .paths(PathSelectors.any())
                // .paths(PathSelectors.ant("/swagger2-demo"))
                .build();
        // @formatter:on
    }

    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        //enabling swagger-ui part for visual documentation
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }*/


    /**
    @Bean
    public UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder().displayRequestDuration(true).validatorUrl("").build();
    }


    @Bean
    public Docket swaggerSpringfoxDocket() {
        Instant starts = Instant.now();
        Contact contact = new Contact("Zaid Abed Jaser", "", "zaid.abed-jaser@arbetsformedlingen.se");

        List<VendorExtension> vext = new ArrayList<>();
        ApiInfo apiInfo = new ApiInfo("Backend API", "This is the best stuff since sliced bread - API", "1.0.0", "", contact, "XBU", "",
                vext);


        Docket docket = new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo).pathMapping("/").
                apiInfo(ApiInfo.DEFAULT).
                forCodeGeneration(true).
                genericModelSubstitutes(ResponseEntity.class).
                ignoredParameterTypes(Pageable.class).
                ignoredParameterTypes(java.sql.Date.class).
                directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class).
                directModelSubstitute(java.time.ZonedDateTime.class, Date.class).
                directModelSubstitute(java.time.LocalDateTime.class, Date.class).
                securityContexts(Lists.newArrayList(securityContext())).
                securitySchemes(Lists.newArrayList(apiKey())).
                useDefaultResponseMessages(false);

        docket = docket.select().paths(regex(DEFAULT_INCLUDE_PATTERN)).build();
        Instant ends = Instant.now();
        log.info("Started Swagger in {} ms", Duration.between(starts, ends));
        return docket;
    }

    private ApiKey apiKey() {
        return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex(DEFAULT_INCLUDE_PATTERN))
                .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope
                = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(
                new SecurityReference("JWT", authorizationScopes));
    }

}**/

