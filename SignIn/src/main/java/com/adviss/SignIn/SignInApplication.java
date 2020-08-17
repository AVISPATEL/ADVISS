package com.adviss.SignIn;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.adviss.SignIn")
@EnableDiscoveryClient
public class SignInApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignInApplication.class, args);
	}
	@Bean
	public Sampler defultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
