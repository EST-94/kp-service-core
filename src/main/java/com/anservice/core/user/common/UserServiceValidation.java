package com.anservice.core.user.common;

import com.anservice.core.user.model.User;

public interface UserServiceValidation {

    /**
     * return true when User parameters are correct.
     *
     * @param user target user DTO
     * @return true / false
     */
    boolean creation(User user);


}
