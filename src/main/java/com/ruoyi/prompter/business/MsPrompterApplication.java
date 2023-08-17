package com.ruoyi.prompter.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
@MapperScan(value = "com.ruoyi.prompter.business.dao")
public class MsPrompterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPrompterApplication.class, args);
	}
	
}
