package com.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.alibaba.servlet")
@SpringBootApplication
public class IndexServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndexServletApplication.class, args);
	}

}
