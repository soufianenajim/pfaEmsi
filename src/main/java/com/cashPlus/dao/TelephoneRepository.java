package com.cashPlus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashPlus.model.Telephone;
import com.cashPlus.model.User;

public interface TelephoneRepository extends JpaRepository<Telephone, Long>{

}
