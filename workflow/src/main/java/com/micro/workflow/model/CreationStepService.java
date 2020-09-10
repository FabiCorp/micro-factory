package com.micro.workflow.model;

public class CreationStepService {

    public static CreationStep[] fetchCreationStepArray(ProductType productType) throws Exception {
        switch (productType) {
            case RASPBERRY_PI_V1:
                return fetchRaspberryPiV1CreationStepArray();
            case RASPBERRY_PI_V2:
                return fetchRaspberryPiV2CreationStepArray();
            default:
                throw new Exception("product type not available in switch statement");
        }
    }

    private static CreationStep[] fetchRaspberryPiV1CreationStepArray() {
        CreationStep[] creationStepArray = new CreationStep[4];
        creationStepArray[0] = new CreationStep(CreationStepType.FETCH_MATERIALS_FOR_PRODUCT, 10);
        creationStepArray[1] = new CreationStep(CreationStepType.CONSTRUCT_PRODUCT, 10);
        creationStepArray[2] = new CreationStep(CreationStepType.TEST_PRODUCT, 10);
        creationStepArray[3] = new CreationStep(CreationStepType.PACKAGE_PRODUCT, 10);
        return creationStepArray;
    }

    private static CreationStep[] fetchRaspberryPiV2CreationStepArray() {
        CreationStep[] creationStepArray = new CreationStep[4];
        creationStepArray[0] = new CreationStep(CreationStepType.FETCH_MATERIALS_FOR_PRODUCT, 10);
        creationStepArray[1] = new CreationStep(CreationStepType.CONSTRUCT_PRODUCT, 20);
        creationStepArray[2] = new CreationStep(CreationStepType.TEST_PRODUCT, 10);
        creationStepArray[3] = new CreationStep(CreationStepType.PACKAGE_PRODUCT, 10);
        return creationStepArray;
    }

}
