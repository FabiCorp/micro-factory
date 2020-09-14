package com.micro.workflow.model;

public interface Robot {

    Product processWorkStep(Product product, CreationStep creationStep);
    float getHealth();
    boolean isAbleToWork();
    void setAbleToWork(boolean status);
    void setHealth(float health);

}
