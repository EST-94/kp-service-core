package com.anservice.core.user.service;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import com.anservice.core.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final UserRepository userRepository;

    @Override
    public UserServiceResponse submitUser(User user) {

        UserServiceResponse response = new UserServiceResponse();
        String taskName = "submitUser";
        response.setDefault(taskName);

        try {
            userRepository.save(user);
        } catch (RuntimeException e) {
//            response.setFailed(CONSTANTS_MEG_HERE);
            log.error("[{}] failed, trace : {}", taskName, e.toString());
        }

        return response;
    }

    @Override
    public UserServiceResponse deleteUser() {
        return null;
    }

    @Override
    public UserServiceResponse ModifyUser() {
        return null;
    }
}
