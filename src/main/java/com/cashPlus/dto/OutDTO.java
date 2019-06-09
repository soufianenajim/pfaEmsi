package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public   class OutDTO extends TransactionDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private double frais;
	
	
	public OutDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, double frais) {
		super(borderaux, date, montantTransfer, refUser);
		this.frais = frais;
	}
	public double getFrais() {
		return frais;
	}
	public void setFrais(double frais) {
		this.frais = frais;
	}
	@Override
	public String toString() {
		return "Out [frais=" + frais + ", toString()=" + super.toString() + "]";
	}
	



}
