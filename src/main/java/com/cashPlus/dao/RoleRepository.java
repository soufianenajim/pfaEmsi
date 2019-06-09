package com.cashPlus.dao;

import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cashPlus.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	@Query(value = "SELECT * FROM Role  where role_name like :name or  borderaux LIKE :name   ORDER BY id \n-- #pageable\n", countQuery = "SELECT count(*) FROM Role where role_name like :name or borderaux LIKE :name", nativeQuery = true)
	Page<Role> findByCriters(Pageable pageable,@Param("name")@NotNull String name);
}
