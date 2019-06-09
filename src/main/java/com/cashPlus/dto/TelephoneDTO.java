package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public   class TelephoneDTO extends FawatirDTO {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	
	public TelephoneDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TelephoneDTO( String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser,
			double frais, String numTelephone) {
		super( borderaux, date, montantTransfer, refUser, frais);
		this.numTelephone = numTelephone;
	}
	
	private String numTelephone;
	public String getNumTelephone() {
		return numTelephone;
	}
	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}
	@Override
	public String toString() {
		return "Telephone [numTelephone=" + numTelephone + ", toString()=" + super.toString() + "]";
	}
	



}
