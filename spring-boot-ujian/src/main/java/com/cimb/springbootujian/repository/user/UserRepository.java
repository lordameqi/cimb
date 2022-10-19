package com.cimb.springbootujian.repository.user;

import com.cimb.springbootujian.entity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    User findByEmail(String email);
}
