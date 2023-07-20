package com.anservice.core.common.status;

public enum TaskStatus {

    STARTING, // when before start ex) validation, init insert, ...
    STARTED, // when service method started.
    COMPLETED, // when after method done.
    SUCCESS, // when after method success.
    FAILED; // when after method failed.
}
