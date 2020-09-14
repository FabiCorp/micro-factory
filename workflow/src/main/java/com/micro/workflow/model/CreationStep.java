package com.micro.workflow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreationStep {
    private final CreationStepType creationStepType;
    private final float creationTime;
    private boolean finishedStep;

    public CreationStep(CreationStepType creationStepType, float creationTime) {
        this.creationStepType = creationStepType;
        this.creationTime = creationTime;
        this.finishedStep = false;
    }
}
