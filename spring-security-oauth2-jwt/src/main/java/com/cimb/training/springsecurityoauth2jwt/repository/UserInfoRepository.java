package com.cimb.training.springsecurityoauth2jwt.repository;

import com.cimb.training.springsecurityoauth2jwt.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Boolean existsByUsername(String username);

    UserInfo findByUsername(String username);



}
