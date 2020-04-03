package team.bishe.wms.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 访问http://localhost:8080/swagger-ui.html获取接口信息
 * */
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("team.bishe.wms.controller")).build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Springboot利用swagger构建api文档")
                .description("简单优雅的restful风格")
                .termsOfServiceUrl("http://localhost:8080/swagger-ui")
                .version("1.0")
                .build(); }
}
