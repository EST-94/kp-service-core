package com.anservice.core.user.controller;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/v1/kpc/users")
@RequiredArgsConstructor
@Tag(name = "User Management", description = "about management operations.")
public class UserManagementController {

    @Operation(summary = "get user information")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "search success")
    })
    @GetMapping
    public ResponseEntity<UserServiceResponse> getUser(
            @RequestParam String userId) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "update user information")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "update success")
    })
    @PatchMapping
    public ResponseEntity<String> updateUser(
            @RequestParam String userId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "update personal profile img")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "update success")
    })
    @PatchMapping("/pic")
    public ResponseEntity<String> updateImgOfUser(
            @RequestParam String userId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
