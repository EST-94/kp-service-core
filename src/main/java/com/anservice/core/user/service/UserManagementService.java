package com.anservice.core.user.service;

import com.anservice.core.common.response.UserServiceResponse;
import com.anservice.core.user.model.User;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface UserManagementService {

    /**
     * update specific user.
     *
     * @param user new data of user
     * @param uid  target user's id
     * @return result
     */
    UserServiceResponse modifyUser(User user, String uid) throws ChangeSetPersister.NotFoundException;
}
