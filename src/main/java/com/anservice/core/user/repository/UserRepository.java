package com.anservice.core.user.repository;

import com.anservice.core.user.model.User;

import java.util.List;

public interface UserRepository {

    /**
     * TODO : temp method of save() method. will be replaced with JPA method.
     * @param user memberDTO
     * @return       true = success, false = failed.
     */
    boolean save(User user);

    /**
     * TODO : temp method of findAll() method. will be replaced with JPA method.
     * @param userId target userId
     * @return       List of target user
     */
    List<User> findAll(String userId);
}
