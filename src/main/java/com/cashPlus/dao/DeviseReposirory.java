package com.cashPlus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashPlus.model.Devise;
import com.cashPlus.model.Role;

public interface DeviseReposirory extends JpaRepository<Devise, Long>{

}
