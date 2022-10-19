package com.starterkit.springboot.brs.controller.v1.api;

import com.starterkit.springboot.brs.controller.v1.request.UserSignupRequest;
import com.starterkit.springboot.brs.dto.model.user.UserDto;
import com.starterkit.springboot.brs.dto.response.Response;
import com.starterkit.springboot.brs.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
@Api(value = "brs-application", description = "Operations pertaining to user management in the BRS application")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public Response signup(@RequestBody @Valid UserSignupRequest userSignupRequest) {
        //untuk masukan admin atau user
            return Response.ok().setPayload(registerUser(userSignupRequest, true));
    }

    private UserDto registerUser(UserSignupRequest userSignupRequest, boolean isAdmin) {
        UserDto userDto = new UserDto()
                .setEmail(userSignupRequest.getEmail())
                .setPassword(userSignupRequest.getPassword())
                .setFirstName(userSignupRequest.getFirstName())
                .setLastName(userSignupRequest.getLastName())
                .setMobileNumber(userSignupRequest.getMobileNumber())
                .setAdmin(isAdmin);

        return userService.signup(userDto);
    }
}
