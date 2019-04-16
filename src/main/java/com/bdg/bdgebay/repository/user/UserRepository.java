package com.bdg.bdgebay.repository.user;

import org.springframework.data.repository.CrudRepository;

import com.bdg.bdgebay.entity.User;
//import org.springframework.data.repository.CrudRepository;

/**
 * @author William Arustamyan
 */


public interface UserRepository extends CrudRepository<User, Integer> {

	User findByIdAndDeletedIsNull(Long userId);

    User findByFirstNameAndUserNameAndId(String firstName, String userName, Long id);

    User findByUserName(String userName);
}
