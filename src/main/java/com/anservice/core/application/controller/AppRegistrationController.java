package com.anservice.core.application.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/v1/kpc/applications")
@Tag(name = "Application Registration", description = "about registration operations.")
public class AppRegistrationController {
}
