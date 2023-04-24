package com.anservice.core.common.status;

public enum TaskStatus {

    STARTING, // when before start ex) validation, init insert, ...
    STARTED, // when service logic started.
    COMPLETED; // when after logic ends.
}
