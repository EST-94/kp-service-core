package com.anservice.core.common.constants;

import com.anservice.core.common.status.TaskStatus;
import org.springframework.http.HttpStatus;

public enum InternalTaskResponse {

    VALIDATION_FAILED_UNAUTHORIZED(TaskStatus.STARTING, "Unauthorized Access", HttpStatus.UNAUTHORIZED);

    private TaskStatus taskStatus;
    private String errorMsg;
    private HttpStatus errorStatus;

    InternalTaskResponse(TaskStatus taskStatus, String errorMsg, HttpStatus errorStatus) {
        this.taskStatus = taskStatus;
        this.errorMsg = errorMsg;
        this.errorStatus = errorStatus;
    }

}
