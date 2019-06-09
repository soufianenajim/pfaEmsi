package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public class RechargeDTO extends TelephoneDTO{

	
	public RechargeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RechargeDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, double frais,
			String numTelephone) {
		super(borderaux, date, montantTransfer, refUser, frais, numTelephone);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747674835418302263L;

	

}
