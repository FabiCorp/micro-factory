package com.micro.workflow.model;

import java.util.List;

public interface Product {
    ProductType getProductType();
    float getTimeForCreation();
    float getCreationCost();
    int getWorkStepCounter();
    void setWorkStepCounter(int workStepCounter);
    void setCreationCost(float creationCost);
    void setTimeForCreation(float timeForCreation);
    public void checkFinishedWorkStep(CreationStepType creationStepType);
    List<CreationStep> getCreationStepList();
}
