package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public class OutInternationalDTO extends OutDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747674835418302263L;

	private double commission;

	
	public OutInternationalDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser,
			double frais, double commission) {
		super(borderaux, date, montantTransfer, refUser, frais);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	

}
