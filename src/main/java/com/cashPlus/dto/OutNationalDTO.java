package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public class OutNationalDTO extends OutDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747674835418302263L;



	public OutNationalDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser,
			double frais) {
		super(borderaux, date, montantTransfer, refUser, frais);
		
	}

	

	

}
