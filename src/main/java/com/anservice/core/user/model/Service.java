package com.anservice.core.user.model;

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
public class Service {

    /*
    service attributes will contain
     */

    public long PID;
    @Id
    public int serviceId;
    public String serviceName;
    public String description;
    public int userAmount;
    public Date createDt;
    public Date modifiedDt;
}
