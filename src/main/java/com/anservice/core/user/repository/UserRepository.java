package com.anservice.core.user.repository;

import com.anservice.core.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    /**
     * Get all users with pagination (for platform admin / dev)
     *
     * @param pageable Pageable object containing page information (page number, page size, sorting)
     * @return Page of User
     */
    Page<User> findAll(Pageable pageable);

    /**
     * Get specific user with uid.
     * @param uid target user's uid
     * @return target user's DTO
     */
    User findByUid(String uid);

    /**
     * check user existence with username.
     * @param username target user's username
     * @return true - exist / false - non exist
     */
    boolean findByUsername(String username);

    /**
     * check user existence with user's email
     * @param email target user's email
     * @return true - exist / false - non exist
     */
    boolean findByEmail(String email);

    /**
     * delete user by its id
     *
     * @param uid target user id
     */
    void deleteByUid(String uid);
}
