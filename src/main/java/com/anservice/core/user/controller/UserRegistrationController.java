package com.anservice.core.user.controller;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import com.anservice.core.user.service.UserRegistrationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/kpc/users")
@Tag(name = "User Registration", description = "about registration operations.")
public class UserRegistrationController {

    private final UserRegistrationService userRegistrationService;

    /**
     * add member.
     *
     * @param user   info of target member
     * @return       join result
     */
    @Operation(summary = "submit user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "submit success")
    })
    @PostMapping("/registration")
    public ResponseEntity<UserServiceResponse> submitUser(
            @RequestBody @NotNull User user) {
        return new ResponseEntity<>(userRegistrationService.submitUser(user), HttpStatus.OK);
    }

    /**
     * delete member.
     * @param userId    uid of target member
     * @return          delete result
     */
    @Operation(summary = "delete user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "delete success")
    })
    @DeleteMapping
    public ResponseEntity<UserServiceResponse> deleteUser(
            @RequestParam("userId") @NotNull String userId) {
        return new ResponseEntity<>(userRegistrationService.deleteUser(userId), HttpStatus.OK);
    }
}
