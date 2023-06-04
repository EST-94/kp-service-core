package com.anservice.core.user.service;

import com.anservice.core.user.model.User;
import com.anservice.core.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final UserRepository userRepository;

    @Override
    public Object joinUser() {

        userRepository.save(new User());

        return null;
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
