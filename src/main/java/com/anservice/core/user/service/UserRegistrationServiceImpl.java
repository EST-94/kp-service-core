package com.anservice.core.user.service;

import com.anservice.core.common.constants.InternalTaskResponse;
import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.common.util.GenerateUtil;
import com.anservice.core.user.common.UserServiceValidation;
import com.anservice.core.user.model.User;
import com.anservice.core.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private final UserServiceValidation userServiceValidation;

    private final UserRepository userRepository;

    private final GenerateUtil generateUtil;

    @Override
    public UserServiceResponse submitUser(User user) {

        UserServiceResponse response = new UserServiceResponse();
        response.setDefault("submitUser");

        user.setUid("test-" + generateUtil.randomString(5));

        if (!userServiceValidation.creation(user)) {
            response.setFailed(InternalTaskResponse.VALIDATION_FAILED_CREATE);
            return response;
        }

        try {
            userRepository.save(user);
            response.setSuccess();
        } catch (RuntimeException e) {
            response.setFailed(InternalTaskResponse.USER_INSERT_FAILED, e);
        }

        return response;
    }

    @Override
    @Transactional
    public UserServiceResponse deleteUser(String userId) {

        UserServiceResponse response = new UserServiceResponse();
        response.setDefault("deleteUser");

        try {
            userRepository.deleteByUid(userId);
            response.setSuccess();
        } catch (RuntimeException e) {
            response.setFailed(InternalTaskResponse.USER_DELETE_FAILED, e);
        }

        return response;
    }
}
