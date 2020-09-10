package com.micro.workflow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreationStep {
    private final CreationStepType creationStepType;
    private final double creationTime;
    private boolean finishedStep;

    public CreationStep(CreationStepType creationStepType, double time) {
        this.creationStepType = creationStepType;
        this.creationTime = time;
        this.finishedStep = false;
    }
}
