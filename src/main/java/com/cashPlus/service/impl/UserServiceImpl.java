package com.cashPlus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.cashPlus.dao.UserReposirory;
import com.cashPlus.model.User;
import com.cashPlus.model.base.PartialList;
import com.cashPlus.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserReposirory userRpository;

	@Override
	public User save(User user) {

		return userRpository.save(user);
	}

	@Override
	public User findById(long idUser) {

		return userRpository.findById(idUser).get();
	}

	@Override
	public void deleteUser(User u) {
		userRpository.deleteById(u.getId());

	}

	@Override
	public PartialList<User> finByCriteres(Pageable page, String name) {
		Page<User> resultat;
		if (name.equals("") && name.length() == 0) {
			resultat = userRpository.findAll(page);
		} else {
			resultat = userRpository.findAllUserCriters(page, name);
		}

		return new PartialList<>(resultat.getTotalElements(), resultat.getContent());
	}

}
