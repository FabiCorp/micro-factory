package com.micro.workflow.model;

import java.util.ArrayList;
import java.util.List;

public class CreationStepService {

    public static List<CreationStep> fetchCreationStepArray(ProductType productType) throws Exception {
        switch (productType) {
            case RASPBERRY_PI_V1:
                return fetchRaspberryPiV1CreationStepArray();
            case RASPBERRY_PI_V2:
                return fetchRaspberryPiV2CreationStepArray();
            default:
                throw new Exception("product type not available in switch statement");
        }
    }

    private static List<CreationStep> fetchRaspberryPiV1CreationStepArray() {
        List<CreationStep> creationStepList = new ArrayList<>();
        creationStepList.add(new CreationStep(CreationStepType.FETCH_MATERIALS_FOR_PRODUCT, 10));
        creationStepList.add(new CreationStep(CreationStepType.CONSTRUCT_PRODUCT, 10));
        creationStepList.add(new CreationStep(CreationStepType.TEST_PRODUCT, 10));
        creationStepList.add(new CreationStep(CreationStepType.PACKAGE_PRODUCT, 10));
       return creationStepList;
    }

    private static List<CreationStep> fetchRaspberryPiV2CreationStepArray() {
        List<CreationStep> creationStepList = new ArrayList<>();
        creationStepList.add(new CreationStep(CreationStepType.FETCH_MATERIALS_FOR_PRODUCT, 10));
        creationStepList.add(new CreationStep(CreationStepType.CONSTRUCT_PRODUCT, 10));
        creationStepList.add(new CreationStep(CreationStepType.TEST_PRODUCT, 10));
        creationStepList.add(new CreationStep(CreationStepType.PACKAGE_PRODUCT, 10));
        return creationStepList;
    }

}
