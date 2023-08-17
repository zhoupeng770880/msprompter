package com.ruoyi.prompter.business.config;

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
public class Swagger2Config {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				//创建API基本信息
				.apiInfo(apiInfo())
				//指定分组，对应(/v2/api-docs?group=)
				.groupName("")
				//base地址，最终会拼接Controller中的地址
				.pathMapping("")
				//控制要暴露的接口
				.select()
				//通过指定扫描包暴露接口
				.apis(RequestHandlerSelectors.basePackage("com.cstn.ai.business.controller"))
				//设置过滤规则暴露接口
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("生态应用服务")
				.description("")
				.version("1.0")
				.termsOfServiceUrl("")
				.license("")
				.licenseUrl("")
				.build();
	}
}
