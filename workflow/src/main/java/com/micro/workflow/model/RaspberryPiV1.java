package com.micro.workflow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RaspberryPiV1 implements Product {

    private final ProductType productType = ProductType.RASPBERRY_PI_V1;
    private final CreationStep[] creationStepArray = CreationStepService.fetchCreationStepArray(productType);
    private float timeForCreation = 0;
    private float creationCost = 0;
    private int workStepCounter = 0;

    public RaspberryPiV1() throws Exception { }

    @Override
    public CreationStepService getCreationStep() {
        return null;
    }
}
