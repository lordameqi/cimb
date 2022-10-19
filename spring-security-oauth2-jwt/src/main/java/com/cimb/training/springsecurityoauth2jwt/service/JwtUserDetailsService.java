package com.cimb.training.springsecurityoauth2jwt.service;

import com.cimb.training.springsecurityoauth2jwt.repository.UserInfoRepository;
import com.cimb.training.springsecurityoauth2jwt.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Slf4j
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoRepository userInfoRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Username service = "+username);
        UserInfo userInfo = userInfoRepository.findByUsername(username);
        log.info("username info = "+userInfo.toString());
        if (userInfo == null) {
            throw new UsernameNotFoundException("User not found  username "+username);
        }
        return new User(userInfo.getUsername(),userInfo.getPassword(),new ArrayList<>());
    }
}
