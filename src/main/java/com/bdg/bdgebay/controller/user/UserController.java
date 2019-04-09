package com.bdg.bdgebay.controller.user;

import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.dto.user.UserUpdateRequest;
import com.bdg.bdgebay.entity.User;
import com.bdg.bdgebay.service.user.UserService;
import com.bdg.bdgebay.service.user.UserServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author William Arustamyan
 */


@RestController
public class UserController {

    private ModelMapper modelMapper;

    @Autowired
    private UserService userService;


    //make this method endpoint
    @RequestMapping(path = "/user/create", method = RequestMethod.POST)
    public User createUser(@RequestBody UserCreationRequest creationRequest) {
        return userService.create(creationRequest);
    }

    @RequestMapping(path = "/user/{id}/update", method =  RequestMethod.PUT)
    public User updateUser(@RequestBody UserUpdateRequest updateRequest) {
    	
		return userService.update(updateRequest);
    	
    }
    
    @RequestMapping(path = "/user/{id}/delete", method = RequestMethod.DELETE)
    public User deleteUser(@RequestBody UserDeleteRequest deleteRequest) {
    	
    	return userService.delete(deleteRequest);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public User getUser()
    
    @Autowired
    public void setModelMapper(final ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
