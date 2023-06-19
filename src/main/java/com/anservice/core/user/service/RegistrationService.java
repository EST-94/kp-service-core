package com.anservice.core.user.service;

import com.anservice.core.user.model.User;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {

    /*
    User CRUD.
     */

    Object joinUser(User user);

    Object deleteUser();

    Object ModifyUser();

}
