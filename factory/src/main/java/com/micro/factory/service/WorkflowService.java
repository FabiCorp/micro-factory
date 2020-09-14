package com.micro.factory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WorkflowService {

    private final RestTemplate restTemplate;

    @Autowired
    public WorkflowService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void processWorkStepForAll() {

    }
}
