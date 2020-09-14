package com.micro.workflow.model;

import org.springframework.stereotype.Service;

@Service
public class RaspberryFactory {

    public static Product createV1() {
        return new RaspberryPiV1();
    }
}
