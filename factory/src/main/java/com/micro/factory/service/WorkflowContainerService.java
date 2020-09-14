package com.micro.factory.service;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.PortBinding;
import com.github.dockerjava.core.DockerClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WorkflowContainerService {

    private List<Container> workflowContainerList = new ArrayList<>();
    private final DockerClient dockerClient = DockerClientBuilder.getInstance().build();
    private int nextWorkFlowId = 0;
    private Logger logger = LoggerFactory.getLogger(WorkflowContainerService.class);

    public void createWorkflowContainerList() {
        for (int index = 0; index < 4; index++) {
            createWorkflowContainer(index);
        }
    }

    private CreateContainerResponse createWorkflowContainer(int index) {
        CreateContainerResponse container
                = dockerClient.createContainerCmd("micro-factory_workflow")
                .withPortBindings(PortBinding.parse("9999")).exec();
        logger.info(container.getId());
        return container;
    }

}
