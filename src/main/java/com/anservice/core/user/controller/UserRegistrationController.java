package com.anservice.core.user.controller;

import com.anservice.core.user.model.User;
import com.anservice.core.user.service.RegistrationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
@Tag(name = "USERS")
@Slf4j
public class UserRegistrationController {

    private final RegistrationService registrationService;

    /**
     * Sample join method of member.
     *
     * @param user info of target member
     * @return       join result
     */
    @PostMapping("/v1/submit")
    public ResponseEntity<String> basicJoin(
            @RequestBody User user) {

        log.info("Called User Info : {}", user);
        registrationService.joinUser(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/tester")
    public ResponseEntity<String> aa() {
        return new ResponseEntity<>("asd", HttpStatus.OK);
    }
}
