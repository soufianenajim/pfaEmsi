package com.cashPlus.service;

import org.springframework.data.domain.Pageable;

import com.cashPlus.model.User;
import com.cashPlus.model.base.PartialList;

public interface UserService {
	User save(User user);

	User findById(long idUser);

	void deleteUser(User u);
	
	PartialList<User> finByCriteres(Pageable page,String name);
}
