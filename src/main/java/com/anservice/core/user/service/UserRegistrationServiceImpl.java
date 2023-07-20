package com.anservice.core.user.service;

import com.anservice.core.common.constants.InternalTaskResponse;
import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.common.util.GenerateUtil;
import com.anservice.core.user.model.User;
import com.anservice.core.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private final UserRepository userRepository;

    private final GenerateUtil generateUtil;

    @Override
    public UserServiceResponse submitUser(User user) {

        UserServiceResponse response = new UserServiceResponse();
        String taskName = "submitUser";
        response.setDefault("submitUser");

        user.setUid("test-" + generateUtil.randomString(5));
        /*
        Validation logic need - email, username
         */
        try {
            userRepository.save(user);
            response.setSuccess();
        } catch (RuntimeException e) {
            response.setFailed(InternalTaskResponse.USER_INSERT_FAILED);
            log.error("[{}] failed, trace : {}", taskName, e.toString());
        }

        return response;
    }

    @Override
    @Transactional
    public UserServiceResponse deleteUser(String userId) {

        UserServiceResponse response = new UserServiceResponse();
        String taskName = "deleteUser";
        response.setDefault(taskName);

        try {
            userRepository.deleteByUid(userId);
            response.setSuccess();
        } catch (RuntimeException e) {
            response.setFailed(InternalTaskResponse.USER_DELETE_FAILED);
            log.error("[{}] failed, trace : {}", taskName, e.toString());
        }

        return response;
    }
}