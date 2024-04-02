package com.example.hospital2.repositories;

import com.example.hospital2.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role,String> {
Role findByRoleName(String roleName);
}
