package com.anservice.core.common.constants;

import com.anservice.core.common.status.TaskStatus;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum InternalTaskResponse {

    VALIDATION_FAILED_UNAUTHORIZED(TaskStatus.STARTING, "Unauthorized Access", HttpStatus.UNAUTHORIZED),
    USER_INSERT_FAILED(TaskStatus.FAILED, "User Insert failed", HttpStatus.INTERNAL_SERVER_ERROR),
    USER_DELETE_FAILED(TaskStatus.FAILED, "User Delete failed", HttpStatus.INTERNAL_SERVER_ERROR),
    USER_UPDATE_FAILED(TaskStatus.FAILED, "User Update failed", HttpStatus.INTERNAL_SERVER_ERROR);

    private TaskStatus taskStatus;
    private String errorMsg;
    private HttpStatus errorStatus;

    InternalTaskResponse(TaskStatus taskStatus, String errorMsg, HttpStatus errorStatus) {
        this.taskStatus = taskStatus;
        this.errorMsg = errorMsg;
        this.errorStatus = errorStatus;
    }

}
