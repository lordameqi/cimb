

package com.finalproject.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.transport.entity.user.Role;
import com.finalproject.transport.entity.user.UserRole;

public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByRole(UserRole passenger);
    
}
