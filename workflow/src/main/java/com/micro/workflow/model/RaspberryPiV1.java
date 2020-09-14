package com.micro.workflow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RaspberryPiV1 implements Product {

    private final ProductType productType = ProductType.RASPBERRY_PI_V1;
    private List<CreationStep> creationStepList;
    private float timeForCreation = 0;
    private float creationCost = 0;
    private int workStepCounter = 0;

    public RaspberryPiV1() {
        try {
            creationStepList = CreationStepService.fetchCreationStepArray(productType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void checkFinishedWorkStep(CreationStepType creationStepType) {
        creationStepList.stream()
                .filter(creationStep -> creationStep.getCreationStepType() == creationStepType)
                .forEach(creationStep -> creationStep.setFinishedStep(true));
    }
}
