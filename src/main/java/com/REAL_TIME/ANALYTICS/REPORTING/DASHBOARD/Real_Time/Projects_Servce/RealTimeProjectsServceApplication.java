package com.REAL_TIME.ANALYTICS.REPORTING.DASHBOARD.Real_Time.Projects_Servce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RealTimeProjectsServceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeProjectsServceApplication.class, args);
	}

}
