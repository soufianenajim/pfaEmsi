package com.cashPlus;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.cashPlus.dao.CtmRepository;
import com.cashPlus.dao.UserReposirory;
import com.cashPlus.model.User;

@SpringBootApplication
public class CashPlus3Application implements CommandLineRunner{
	@Autowired
	CtmRepository ctmRepository;
	@Autowired UserReposirory userReposirory;
	

	public static void main(String[] args) {
		SpringApplication.run(CashPlus3Application.class, args);
		//Ctm ctm =new Ctm("a", "b", 3.0, new User(), "d");
	
		//System.out.println(ctm.toString());
			
	}

	@Override
	public void run(String... args) throws Exception {
	
	Page<User> page=userReposirory.findAllUserCriters(PageRequest.of(0, 10), null);
	System.out.println(page.getNumberOfElements());
	}

}
