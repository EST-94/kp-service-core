package com.anservice.core.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Builder
@Entity
@RequiredArgsConstructor
public class Application {

    /*
    service attributes will contain
     */

    public static final long PID = 0;
    @Id
    public String uid;
    public String serviceName;
    public String serviceUrl;
    public String description;
    public int userAmount;
    public Date createDt;
    public Date modifiedDt;
}
