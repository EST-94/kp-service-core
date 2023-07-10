package com.anservice.core.application.controller;

import com.anservice.core.application.model.Application;
import com.anservice.core.common.response.AppServiceResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/v1/kpc/applications")
@Tag(name = "Application Registration", description = "about registration operations.")
public class AppRegistrationController {

    /**
     * add application.
     *
     * @param application   info of target application
     * @return              join result
     */
    @Operation(summary = "submit application")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "submit success")
    })
    @PostMapping("/registration")
    public ResponseEntity<AppServiceResponse> submitApplication(
            @RequestBody Application application) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * delete application.
     * @param appId    uid of target application
     * @return         delete result
     */
    @Operation(summary = "delete user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "delete success")
    })
    @DeleteMapping
    public ResponseEntity<AppServiceResponse> deleteApplication(
            @RequestParam("appId") String appId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
