package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public  class FawatirDTO extends TransactionDTO {

	private static final long serialVersionUID = 1L;

	public FawatirDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FawatirDTO( String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser,
			double frais) {
		super( borderaux, date, montantTransfer, refUser);
		this.frais = frais;
	}

	
	protected double frais;

	public double getFrais() {
		return frais;
	}

	public void setFrais(double frais) {
		this.frais = frais;
	}

	@Override
	public String toString() {
		return "Fawatir [frais=" + frais + ", toString()=" + super.toString() + "]";
	}

}
