package com.anservice.core.common.response;

import com.anservice.core.common.constants.InternalTaskResponse;
import com.anservice.core.common.status.TaskStatus;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
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

    public void setFailed(InternalTaskResponse response) {
        this.taskStatus = response.getTaskStatus();
        this.errorMsg = response.getErrorMsg();
        this.responseStatus = response.getErrorStatus();
    }

    public void setSuccess() {
        this.taskStatus = TaskStatus.SUCCESS;
    }
}
