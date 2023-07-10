package com.anservice.core.admin.controller;

import com.anservice.core.admin.model.Admin;
import com.anservice.core.common.response.AdminServiceResponse;
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
@Tag(name = "Admin Registration", description = "about registration operations.")
public class AdminRegistrationController {

    /**
     * add admin account.
     *
     * @param admin   info of target admin
     * @return        join result
     */
    @Operation(summary = "submit admin")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "submit success")
    })
    @PostMapping("/registration")
    public ResponseEntity<AdminServiceResponse> submitAdmin(
            @RequestBody Admin admin) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * delete admin account.
     * @param adminId    uid of target admin
     * @return           delete result
     */
    @Operation(summary = "delete admin")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "delete success")
    })
    @DeleteMapping
    public ResponseEntity<AdminServiceResponse> deleteAdmin(
            @RequestParam("adminId") String adminId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
