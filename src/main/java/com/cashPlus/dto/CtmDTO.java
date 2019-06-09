package com.cashPlus.dto;

import javax.validation.constraints.NotNull;

public class CtmDTO extends TransactionDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public CtmDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, String numCtm) {
		super(borderaux, date, montantTransfer, refUser);
		this.numCtm = numCtm;
	}

	
	private String numCtm;

	public String getNumCtm() {
		return numCtm;
	}

	public void setNumCtm(String numCtm) {
		this.numCtm = numCtm;
	}

	@Override
	public String toString() {
		return "Ctm [numCtm=" + numCtm + ", toString()=" + super.toString() + "]";
	}
	

}
