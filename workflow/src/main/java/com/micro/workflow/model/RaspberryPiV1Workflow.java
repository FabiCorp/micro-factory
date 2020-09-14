package com.micro.workflow.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RaspberryPiV1Workflow implements Workflow {

    private final Logger logger = LoggerFactory.getLogger(RaspberryPiV1Workflow.class);
    private Product raspberryPiV1 = RaspberryFactory.createV1();
    private final WorkspaceImpl[] workspaceArray = new WorkspaceImpl[raspberryPiV1.getCreationStepList().size()];;
    private int workStepToProcessNext = 0;

    public RaspberryPiV1Workflow() {
        for (int index = 0; index < workspaceArray.length; index++) {
            workspaceArray[index] = new WorkspaceImpl(raspberryPiV1.getCreationStepList().get(index), index, 4);
        }
    }

    public void processWorkStep() {
        raspberryPiV1 = workspaceArray[workStepToProcessNext++].processWorkStep(raspberryPiV1);
        logger.debug("Current production time for the product: " + raspberryPiV1.getTimeForCreation());

        if (workStepToProcessNext == raspberryPiV1.getCreationStepList().size()) {
            logger.info("Product with ID: " + raspberryPiV1 + " finished.");
            logger.info("Start with the product creation of a new product!");
            // TODO: Store product in the logistic service
            resetWorkflowForNewProduct();
        }
    }

    private void resetWorkflowForNewProduct() {
        raspberryPiV1 = RaspberryFactory.createV1();
        workStepToProcessNext = 0;
    }
}
