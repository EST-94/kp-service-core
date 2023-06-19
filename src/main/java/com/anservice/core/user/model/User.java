package com.anservice.core.user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Builder
@Entity
@RequiredArgsConstructor
@Table(name = "kp_user")
public class User {

    /*
    user attributes will contain
     */

    public long PID; // Adjust 'AtomicLong' when concurrent issue occurs.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int userId;
    public String userName;
    public String firstName;
    public String lastName;
    public int age;
    public String sex;
    public String initServiceName;
    public Date createDt;
    public Date modifiedDt;
}
