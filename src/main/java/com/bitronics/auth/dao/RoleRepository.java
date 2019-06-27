package com.bitronics.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitronics.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
