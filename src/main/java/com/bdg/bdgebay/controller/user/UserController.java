package com.bdg.bdgebay.controller.user;

import com.bdg.bdgebay.dto.user.UserCreationRequest;
import com.bdg.bdgebay.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author William Arustamyan
 */


@RestController
public class UserController {

    private ModelMapper modelMapper;


    //make this method endpoint
    public User createUser(UserCreationRequest creationRequest) {
        System.out.println(creationRequest);
        return new User();
    }


    @Autowired
    public void setModelMapper(final ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
