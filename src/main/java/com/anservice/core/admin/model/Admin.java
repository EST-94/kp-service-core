package com.anservice.core.admin.model;

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
@Table(name = "kp_admin")
public class Admin {

    /*
    admin attributes will contain
     */

    public static final long PID = 0; // Adjust 'AtomicLong' when concurrent issue occurs.
    @Id
    @Column(name = "uid", updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String uid;

    @Column(name = "admin_name")
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

    @Column(name = "created_dt")
    @Schema(defaultValue = "20230624220011")
    public Date createDt;

    @Column(name = "modified_dt")
    @Schema(defaultValue = "20230624220011")
    public Date modifiedDt;
}
