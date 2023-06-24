package com.anservice.core.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
    @Column(name = "user_id", updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int userId;

    @Column(name = "user_name")
    @Schema(defaultValue = "example1994")
    public String userName;

    @Column(name = "first_name")
    @Schema(defaultValue = "hong")
    public String firstName;

    @Column(name = "last_name")
    @Schema(defaultValue = "gildong")
    public String lastName;

    @Column(name = "email")
    @Schema(defaultValue = "bxob1040@gmail.com")
    public String email;

    @Column(name = "age")
    @Schema(defaultValue = "20")
    public int age;

    @Column(name = "sex")
    @Schema(defaultValue = "male")
    public String sex;

    @Column(name = "init_service_name")
    @Schema(defaultValue = "MBTITester")
    public String initServiceName;

    @Column(name = "created_dt")
    @Schema(defaultValue = "20230624220011")
    public Date createDt;

    @Column(name = "modified_dt")
    @Schema(defaultValue = "20230624220011")
    public Date modifiedDt;
}
