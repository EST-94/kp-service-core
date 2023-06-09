package com.anservice.core.admin.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/v1/kpc/admin")
@Tag(name = "Admin Management", description = "about management operations.")
public class AdminManagementController {
}
