package com.anservice.core.common.response;

import org.springframework.http.HttpStatus;

public class CreateResponse {

    private String taskName;
    private String errorCode;
    private String errorMsg;
    private String taskStatus;
    private HttpStatus responseStatus;

    public void setDefault(String taskName) {
        this.taskName = taskName;
        this.taskStatus = "STARTED";
    }
}
