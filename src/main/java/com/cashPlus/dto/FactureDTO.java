package com.cashPlus.dto;

import javax.validation.constraints.NotNull;

public class FactureDTO extends TelephoneDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747674835418302263L;

	
	public FactureDTO() {
		super();
	
	}


	public FactureDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, double frais,
			String numTelephone) {
		super(borderaux, date, montantTransfer, refUser, frais, numTelephone);
	
	}

	

}
