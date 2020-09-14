package com.micro.factory;

import com.micro.factory.service.WorkflowContainerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
//		new WorkflowContainerService().createWorkflowContainerList();
	}

}
