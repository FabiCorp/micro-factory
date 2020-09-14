package com.micro.factory.configuration;

import com.micro.factory.service.WorkflowContainerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


public class FactoryWorkflowInitializer implements CommandLineRunner {

    private final WorkflowContainerService workflowContainerService;

    public FactoryWorkflowInitializer() {
        this.workflowContainerService = new WorkflowContainerService();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DOING STUFF");

    }
}
