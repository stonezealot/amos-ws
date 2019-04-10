package com.epb.ah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AhWsApplication {
//public class FnbWsApplication extends SpringBootServletInitializer { // for war

	public static void main(String[] args) {
		SpringApplication.run(AhWsApplication.class, args);
	}
}
