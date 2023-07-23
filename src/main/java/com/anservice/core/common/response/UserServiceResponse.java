package com.anservice.core.common.response;

import com.anservice.core.common.constants.InternalTaskResponse;
import com.anservice.core.common.status.TaskStatus;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Getter
@Slf4j
public class UserServiceResponse {

    private String taskName;
    private String errorCode;
    private String errorMsg;
    private TaskStatus taskStatus;
    private HttpStatus responseStatus;

    public void setDefault(String taskName) {
        this.taskName = taskName;
        this.taskStatus = TaskStatus.STARTED;
    }

    public void setFailed(InternalTaskResponse response, RuntimeException e) {
        this.taskStatus = response.getTaskStatus();
        this.errorMsg = response.getErrorMsg();
        this.responseStatus = response.getErrorStatus();
        log.error("[{}] failed, trace : {}", this.taskName, e.toString());
    }

    public void setSuccess() {
        this.taskStatus = TaskStatus.SUCCESS;
    }

    @Override
    public String toString() {
        return "[UserServiceResponse] [taskName : " + this.taskName
                + ", errorCode : " + this.errorCode
                + ", errorMsg : " + this.errorMsg
                + ", taskStatus : " + this.taskStatus
                + ", responseStatus : " + this.responseStatus + "]";
    }
}
