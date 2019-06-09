package com.cashPlus.dto;

import javax.validation.constraints.NotNull;

public class AutreTransactionDTO extends TransactionDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AutreTransactionDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, String info) {
		super(borderaux, date, montantTransfer, refUser);
		this.info = info;
	}
	
	private String info ;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String toString() {
		return "AutreTransaction [info=" + info + ", toString()=" + super.toString() + "]";
	}


	

}
