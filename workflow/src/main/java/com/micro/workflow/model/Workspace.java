package com.micro.workflow.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Workspace {

    private final List<Robot> robotList = new ArrayList<>();
    private final int workspaceId;
    private final CreationStep creationStep;

    public Workspace(CreationStep creationStep, int workspaceId, int amountOfRobots) {
        this.workspaceId = workspaceId;
        this.creationStep = creationStep;
        for (int index = 0; index < amountOfRobots; index++) {
            robotList.add(new RobotImpl(workspaceId));
        }
    }

    public Product processWorkStep(Product product) {
        for (Robot robot : robotList) {
            product = robot.processWorkStep(product);
        }
        return product;
    }
}
