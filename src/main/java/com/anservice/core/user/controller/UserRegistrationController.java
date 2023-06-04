package com.anservice.core.user.controller;

import com.anservice.core.user.model.User;
import com.anservice.core.user.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserRegistrationController {

    private final RegistrationService registrationService;

    /**
     * Sample join method of member.
     *
     * @param user info of target member
     * @return       join result
     */
    @PostMapping("/submit")
    public ResponseEntity<String> basicJoin(
            @RequestBody User user) {

        Object tempValue = registrationService.joinUser();

        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
