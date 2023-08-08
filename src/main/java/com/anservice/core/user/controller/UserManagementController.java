package com.anservice.core.user.controller;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import com.anservice.core.user.service.UserManagementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/v1/kpc/users")
@RequiredArgsConstructor
@Tag(name = "User Management", description = "about management operations.")
public class UserManagementController {

    private final UserManagementService userManagementService;

    @Operation(summary = "get user information with pagination")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "search success")
    })
    @GetMapping("/lists")
    public ResponseEntity<Page<User>> getUserWithPagination(Pageable pageable) {
        return new ResponseEntity<>(userManagementService.getAllUsers(pageable), HttpStatus.OK);
    }

    @Operation(summary = "get specific user information")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "search success")
    })
    @GetMapping
    public ResponseEntity<User> getUser(
            @RequestParam String userId) {
        return new ResponseEntity<>(userManagementService.getSpecificUser(userId), HttpStatus.OK);
    }

    @Operation(summary = "update user information")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "update success")
    })
    @PatchMapping
    public ResponseEntity<UserServiceResponse> updateUser(
            @RequestParam String userId,
            @RequestBody User user) throws ChangeSetPersister.NotFoundException {
        return new ResponseEntity<>(userManagementService.modifyUser(user, userId), HttpStatus.OK);
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
