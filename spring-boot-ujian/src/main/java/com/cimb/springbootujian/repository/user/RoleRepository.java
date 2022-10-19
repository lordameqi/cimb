package com.cimb.springbootujian.repository.user;

import com.cimb.springbootujian.entity.user.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Integer> {
        Role findById(int id);
}
