package com.cashPlus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cashPlus.model.Facture;
import com.cashPlus.service.FactureService;
import com.cashPlus.service.UserService;

@SpringBootApplication
public class CashPlus3Application   {

	@Autowired
	private FactureService factureService;
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(CashPlus3Application.class, args);

	}



}
