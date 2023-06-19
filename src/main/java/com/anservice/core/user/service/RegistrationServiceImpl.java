package com.anservice.core.user.service;

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
    public Object joinUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Object deleteUser() {
        return null;
    }

    @Override
    public Object ModifyUser() {
        return null;
    }
}
