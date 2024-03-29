package com.anservice.core.user.service;

import com.anservice.core.common.constants.InternalTaskResponse;
import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import com.anservice.core.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class UserManagementServiceImpl implements UserManagementService {

    private final UserRepository userRepository;

    @Override
    public User getSpecificUser(String uid) {
        return userRepository.findByUid(uid);
    }

    @Override
    public Page<User> getAllUsers(Pageable pageable) {

        /* TODO:
        -- adjust conditions after set key of user table
         */

        return userRepository.findAll(pageable);
    }

    @Override
    public UserServiceResponse modifyUser(User user, String uid) throws ChangeSetPersister.NotFoundException {

        UserServiceResponse response = new UserServiceResponse();
        response.setDefault("modifyUser");

        /* TODO:
        -- Validation logic need - email, username
        -- migrate select DTO method to validation
        -- adjust custom exception
         */
        User targetUser = userRepository.findById(uid)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
        targetUser.setModifiedDt(new Date());

        /* TODO:
        add more setter
         */

        try {
            userRepository.save(targetUser);
            response.setSuccess();
        } catch (RuntimeException e) {
            response.setFailed(InternalTaskResponse.USER_UPDATE_FAILED, e);
        }

        return response;
    }
}
