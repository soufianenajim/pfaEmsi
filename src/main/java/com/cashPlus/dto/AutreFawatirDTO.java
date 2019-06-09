package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public class AutreFawatirDTO extends FawatirDTO {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public AutreFawatirDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, double frais,
			String refPaiement) {
		super(borderaux, date, montantTransfer, refUser, frais);
		this.refPaiement = refPaiement;
	}
	
	private String refPaiement;
	public String getRefPaiement() {
		return refPaiement;
	}
	public void setRefPaiement(String refPaiement) {
		this.refPaiement = refPaiement;
	}
	@Override
	public String toString() {
		return "AutreFawatir [refPaiement=" + refPaiement + ", toString()=" + super.toString() + "]";
	}
	

	
	
	

}
