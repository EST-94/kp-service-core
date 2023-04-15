package com.anservice.core.user.service;

import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {

    /*
    User CRUD.
     */

    Object joinUser();

    Object deleteUser();

    Object ModifyUser();

}
