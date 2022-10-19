package com.cimb.training.springsecurityoauth2jwt.controller;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.BCryptVersion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cimb.training.springsecurityoauth2jwt.entity.UserInfo;
import com.cimb.training.springsecurityoauth2jwt.exceptions.ValidationException;
import com.cimb.training.springsecurityoauth2jwt.repository.UserInfoRepository;

@RestController
public class UserInfoController {
    final private UserInfoRepository userInfoRepository;

    // private HashData hashData = new HashData();
    public UserInfoController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    //    Menambahkan Username Baru
    @PostMapping("/user")
    public Boolean create(@RequestBody Map<String, String> body) throws NoSuchAlgorithmException {
        String username = body.get("username");
        if (userInfoRepository.existsByUsername(username)) {
            throw new ValidationException("Username already existed");
        }
        String password = body.get("password");


        String encodedPassword = new BCryptPasswordEncoder(BCryptVersion.$2B).encode(password);
        // String hashedPassword = hashData.get_SHA_512_SecurePassword(password);

        String fullname = body.get("fullname");
        userInfoRepository.save(new UserInfo(username, encodedPassword, fullname));
        return true;

    }
}