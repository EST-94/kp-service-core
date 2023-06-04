package com.anservice.core.user.repository;

import com.anservice.core.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * get All users
     *
     * @param userId target userId
     * @return       List of target user
     */
//    List<User> findAll(String userId);
}
