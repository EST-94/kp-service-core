package com.anservice.core.user.service;

import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    /*
    User signIn, signOut.
     */

    Object signIn();

    Object signOut();

}
