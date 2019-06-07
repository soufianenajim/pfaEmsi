package com.cashPlus.model;

import javax.persistence.DiscriminatorValue;
import javax.validation.constraints.NotNull;

@DiscriminatorValue("INT")
public class OutInternational extends Out{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747674835418302263L;

	public OutInternational(String borderaux, String date, double montantTransfer, @NotNull User refUser, double frais,
			double frais2) {
		super(borderaux, date, montantTransfer, refUser, frais, frais2);
		// TODO Auto-generated constructor stub
	}

	

}
