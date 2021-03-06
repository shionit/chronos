package com.github.shionit.chronos;

import static springfox.documentation.schema.AlternateTypeRules.newRule;

import com.fasterxml.classmate.TypeResolver;
import com.google.common.base.Predicate;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration for Swagger2
 */
@EnableSwagger2
@RequiredArgsConstructor
@Configuration
@Profile({"dev", "it"})
public class Swagger2Config {

  /**
   * typeResolver
   */
  private final TypeResolver typeResolver;

  /**
   * API Docket definition
   *
   * @return Docket
   */
  @Bean
  public Docket myApi() {
    // https://springfox.github.io/springfox/docs/current/
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(paths())
        .build()
        .pathMapping("/")
        .directModelSubstitute(LocalDate.class, String.class)
        .genericModelSubstitutes(ResponseEntity.class)
        .alternateTypeRules(
            newRule(typeResolver.resolve(DeferredResult.class,
                typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
                typeResolver.resolve(WildcardType.class)))
        .apiInfo(apiInfo());
  }

  /**
   * ドキュメント生成の対象とするAPIのURLを返す
   *
   * @return ドキュメント生成対象のAPIのURL
   */
  private Predicate<String> paths() {
    return PathSelectors.any();
  }

  /**
   * Api information
   *
   * @return ApiInfo
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Chronos Sample API")
        .description("description of this api")
        .version("v1")
        .termsOfServiceUrl("My terms of service URL")
        .contact(new Contact(
            "myContactName",
            "myContactUrl",
            "myContactEmail"))
        .license("myLicence")
        .licenseUrl("myLicenseUrl")
        .build();
  }
}
