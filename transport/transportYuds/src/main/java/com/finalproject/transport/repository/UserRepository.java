

package com.finalproject.transport.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.transport.entity.user.User;


public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String string);

}
