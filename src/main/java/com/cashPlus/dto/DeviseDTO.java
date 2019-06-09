package com.cashPlus.dto;

import javax.validation.constraints.NotNull;


public class DeviseDTO extends TransactionDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	public DeviseDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, String qualiteClient) {
		super(borderaux, date, montantTransfer, refUser);
		this.qualiteClient = qualiteClient;
	}

	
	private String qualiteClient;

	public String getQualiteClient() {
		return qualiteClient;
	}

	public void setQualiteClient(String qualiteClient) {
		this.qualiteClient = qualiteClient;
	}

	@Override
	public String toString() {
		return "Devise [qualiteClient=" + qualiteClient + ", toString()=" + super.toString() + "]";
	}
	

}
