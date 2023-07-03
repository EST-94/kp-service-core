package com.anservice.core.user.controller;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import com.anservice.core.user.service.RegistrationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/users")
@Tag(name = "Registration", description = "about registration operations.")
@Slf4j
public class UserRegistrationController {

    private final RegistrationService registrationService;

    /**
     * Sample join method of member.
     *
     * @param user info of target member
     * @return       join result
     */
    @Operation(summary = "submit user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "submit success")
    })
    @PostMapping("/submit")
    public ResponseEntity<UserServiceResponse> submitUser(
            @RequestBody User user) {

        return new ResponseEntity<>(registrationService.submitUser(user), HttpStatus.OK);
    }

    @GetMapping("/tester")
    public ResponseEntity<String> aa() {
        return new ResponseEntity<>("asd", HttpStatus.OK);
    }
}
