package com.cashPlus.dto;

import javax.validation.constraints.NotNull;

public class NeoSurfPayExpressDTO extends TransactionDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numCommande;

	public NeoSurfPayExpressDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser,
			String numCommande) {
		super(borderaux, date, montantTransfer, refUser);
		this.numCommande = numCommande;
	}

	public String getNumCommande() {
		return numCommande;
	}

	public void setNumCommande(String numCommande) {
		this.numCommande = numCommande;
	}

	@Override
	public String toString() {
		return "NeoSurfPayExpress [numCommande=" + numCommande + ", toString()=" + super.toString() + "]";
	}

}
