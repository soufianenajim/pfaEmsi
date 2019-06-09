package com.cashPlus.dto;

import javax.validation.constraints.NotNull;

public class SpeedBoxdDTO extends TransactionDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SpeedBoxdDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser,
			String numColis) {
		super(borderaux, date, montantTransfer, refUser);
		this.numColis = numColis;
	}

	private String numColis;

	public String getNumColis() {
		return numColis;
	}

	public void setNumColis(String numColis) {
		this.numColis = numColis;
	}

	@Override
	public String toString() {
		return "SpeedBox [numColis=" + numColis + ", toString()=" + super.toString() + "]";
	}

}
