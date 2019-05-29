package com.epb.amos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmosWsApplication {
//public class FnbWsApplication extends SpringBootServletInitializer { // for war

	public static void main(String[] args) {
		SpringApplication.run(AmosWsApplication.class, args);
	}
}
