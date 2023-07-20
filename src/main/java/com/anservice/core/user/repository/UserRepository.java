package com.anservice.core.user.repository;

import com.anservice.core.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Get all users with pagination (for platform admin / dev)
     *
     * @param pageable Pageable object containing page information (page number, page size, sorting)
     * @return Page of User
     */
    Page<User> findAll(Pageable pageable);

    /**
     * delete user by its id
     * @param uid target user id
     */
    void deleteByUid(String uid);
}
