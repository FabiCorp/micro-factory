package com.micro.workflow.controller;

import com.micro.workflow.model.RaspberryPiV1Workflow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "raspberry/v1")
public class RaspberryV1WorkflowController {

    private final RaspberryPiV1Workflow raspberryPiV1Workflow;

    @Autowired
    public RaspberryV1WorkflowController(RaspberryPiV1Workflow raspberryPiV1Workflow) {
        this.raspberryPiV1Workflow = raspberryPiV1Workflow;
    }

    @GetMapping(value = "process")
    public void processWorkStep() {
        raspberryPiV1Workflow.processWorkStep();
    }
}
