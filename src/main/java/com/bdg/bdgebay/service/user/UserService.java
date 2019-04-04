package com.bdg.bdgebay.service.user;

import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.dto.user.UserUpdateRequest;
import com.bdg.bdgebay.entity.User;

/**
 * @author William Arustamyan
 */

public interface UserService {

    User get(Long userId);

    User create(UserCreationRequest creationRequest);

    User delete(Long userId);

    User update(UserUpdateRequest updateRequest);

}
