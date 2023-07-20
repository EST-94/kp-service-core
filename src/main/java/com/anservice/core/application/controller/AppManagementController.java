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
@Tag(name = "Application Management", description = "about management operations.")
public class AppManagementController {

    /**
     * get application information of input appId.
     *
     * @param appId     uid of target application
     * @return          result
     */
    @Operation(summary = "get application info")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "get information success")
    })
    @GetMapping
    public ResponseEntity<AppServiceResponse> getApplicationInfo(
            @RequestParam("appId") String appId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * update application information of input appId.
     *
     * @param appId         uid of target application
     * @param application   update DTO
     * @return              result
     */
    @Operation(summary = "update application info")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "update success")
    })
    @PatchMapping
    public ResponseEntity<AppServiceResponse> updateApplicationInfo(
            @RequestParam("appId") String appId,
            @RequestBody Application application) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * update picture of application.
     *
     * @param appId         uid of target application
     * @param application   update DTO
     * @return              result
     */
    @Operation(summary = "update picture of application")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "update success")
    })
    @PatchMapping("/pic")
    public ResponseEntity<AppServiceResponse> updateApplicationPicture(
            @RequestParam("appId") String appId,
            @RequestBody Application application) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
