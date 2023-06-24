package com.anservice.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/services")
public class TempController {

    /**
     * init REST of project.
     *
     * @param param     sample parameter
     * @return          returnString
     */
    @GetMapping("/")
    public ResponseEntity<String> rootContext(
            @RequestParam String param
    ) {

        String returnString = "hello world, " + param;
        return new ResponseEntity<>(returnString, HttpStatus.OK);
    }

}
