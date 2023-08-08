package com.anservice.core.user.service;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserManagementService {

    /**
     * get paginated user information.
     *
     * @param pageable DTO for pagination.
     * @return result
     */
    Page<User> getAllUsers(Pageable pageable);

    /**
     * get specific user.
     *
     * @param uid  target user's id
     * @return result
     */
    User getSpecificUser(String uid);

    /**
     * update specific user.
     *
     * @param user new data of user
     * @param uid  target user's id
     * @return result
     */
    UserServiceResponse modifyUser(User user, String uid) throws ChangeSetPersister.NotFoundException;
}
