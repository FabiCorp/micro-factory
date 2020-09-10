package com.micro.workflow.model;

public interface Product {
    ProductType getProductType();
    float getTimeForCreation();
    float getCreationCost();
    int getWorkStepCounter();
    void setWorkStepCounter(int workStepCounter);
    void setCreationCost(float creationCost);
    void setTimeForCreation(float timeForCreation);
    CreationStepService getCreationStep();
}
