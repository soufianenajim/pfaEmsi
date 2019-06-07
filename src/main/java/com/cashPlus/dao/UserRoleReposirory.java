package com.cashPlus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashPlus.model.Role;
import com.cashPlus.model.UserRole;

public interface UserRoleReposirory extends JpaRepository<UserRole, Long>{

}
