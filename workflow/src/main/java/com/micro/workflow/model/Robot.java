package com.micro.workflow.model;

public interface Robot {

    Product processWorkStep(Product product);
    float getHealth();
    boolean isAbleToWork();
    void setAbleToWork(boolean status);
    void setHealth(float health);

}
