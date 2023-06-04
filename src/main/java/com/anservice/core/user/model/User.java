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
public class User {

    /*
    user attributes will contain
     */

    public long PID; // Adjust 'AtomicLong' when concurrent issue occurs.
    @Id
    public int userId;
    public String userName;
    public String firstName;
    public String lastName;
    public int age;
    public Date createDt;
    public Date modifiedDt;
}
