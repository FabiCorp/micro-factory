package com.micro.workflow.configuration;

import com.micro.workflow.model.RaspberryPiV1Workflow;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class WorkflowConfiguration {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public RaspberryPiV1Workflow raspberryPiV1Workflow() {
        return new RaspberryPiV1Workflow();
    }

}
