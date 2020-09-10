package com.micro.workflow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RobotImpl implements Robot {

    private final int workspaceId;
    private float health = 100;
    private boolean ableToWork = true;

    public RobotImpl(int workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public Product processWorkStep(Product product) {
        return null;
    }

}
