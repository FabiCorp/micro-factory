package com.micro.workflow.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WorkspaceImpl implements Workspace {

    private final List<Robot> robotList = new ArrayList<>();
    private final int workspaceId;
    private final CreationStep creationStep;

    public WorkspaceImpl(CreationStep creationStep, int workspaceId, int amountOfRobots) {
        this.workspaceId = workspaceId;
        this.creationStep = creationStep;
        for (int index = 0; index < amountOfRobots; index++) {
            robotList.add(new RobotImpl(workspaceId));
        }
    }

    @Override
    public Product processWorkStep(Product product) {
        for (Robot robot : robotList) {
            product = robot.processWorkStep(product, creationStep);
        }
        product.checkFinishedWorkStep(creationStep.getCreationStepType());
        return product;
    }

    public void resetWorkStepsForNewProduct() {
        creationStep.setFinishedStep(false);
    }

}
