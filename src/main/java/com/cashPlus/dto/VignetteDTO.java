package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public class VignetteDTO extends FawatirDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public VignetteDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, double frais,
			String matriculeVehicule) {
		super(borderaux, date, montantTransfer, refUser, frais);
		this.matriculeVehicule = matriculeVehicule;
	}

	
	private String matriculeVehicule;

	public String getMatriculeVehicule() {
		return matriculeVehicule;
	}

	public void setMatriculeVehicule(String matriculeVehicule) {
		this.matriculeVehicule = matriculeVehicule;
	}

	@Override
	public String toString() {
		return "Vignette [matriculeVehicule=" + matriculeVehicule + ", toString()=" + super.toString() + "]";
	}
	

}
