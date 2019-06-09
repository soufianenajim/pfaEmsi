package com.cashPlus.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;


public class EauElectriciteDTO extends FawatirDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	public EauElectriciteDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, double frais,
			String numFacture) {
		super(borderaux, date, montantTransfer, refUser, frais);
		this.numFacture = numFacture;
	}


	private String numFacture;

	public String getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}

}
