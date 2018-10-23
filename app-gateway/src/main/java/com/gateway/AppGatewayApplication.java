package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import hello.filters.pre.SimpleFilter;


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class AppGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGatewayApplication.class, args);
	}

	@Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }
}
