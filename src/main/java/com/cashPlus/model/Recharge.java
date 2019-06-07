package com.cashPlus.model;

import javax.persistence.DiscriminatorValue;
import javax.validation.constraints.NotNull;

@DiscriminatorValue("R")
public class Recharge extends Telephone{

	public Recharge(String borderaux, String date, double montantTransfer, @NotNull User refUser, double frais,
			String numTelephone) {
		super(borderaux, date, montantTransfer, refUser, frais, numTelephone);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747674835418302263L;

	

}
