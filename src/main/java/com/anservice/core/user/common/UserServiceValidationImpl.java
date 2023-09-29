package com.anservice.core.user.common;

import com.anservice.core.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserServiceValidationImpl implements UserServiceValidation{

    @Override
    public boolean creation(User user) {
        if (!isUserFormValid(user)) {
            return false;
        } else if (!isUserExist(user)) {
            return false;
        } else return true;
    }

    private boolean isUserExist(User user) {

        /*
        TODO : Email, username validation
         */

        return true;
    }
    private boolean isUserFormValid(User user) {
        return true;
    }
}
