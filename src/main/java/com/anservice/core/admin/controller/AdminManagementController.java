package com.anservice.core.admin.controller;

import com.anservice.core.common.response.AdminServiceResponse;
import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
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
@RequestMapping(path = "/v1/kpc/admin")
@Tag(name = "Admin Management", description = "about management operations.")
public class AdminManagementController {


    @Operation(summary = "update admin")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "update success")
    })
    @PatchMapping
    public ResponseEntity<AdminServiceResponse> updateAdmin(
            @RequestBody User user,
            @RequestParam String adminId) {

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @Operation(summary = "get user accounts of specific admin")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "search success")
    })
    @GetMapping("/users/{AdminId}/")
    public ResponseEntity<AdminServiceResponse> getUserByAdmin(
            @RequestParam("userId") String userId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
