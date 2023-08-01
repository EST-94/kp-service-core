package com.anservice.core.user.service;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;

public interface UserRegistrationService {

    /*
    User CRUD.
     */

    UserServiceResponse submitUser(User user);

    UserServiceResponse deleteUser(String userId);

}
