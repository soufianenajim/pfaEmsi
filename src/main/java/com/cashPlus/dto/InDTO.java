package com.cashPlus.dto;

import javax.validation.constraints.NotNull;

public class InDTO extends TransactionDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long sms;

	private double frais;

	public InDTO(String borderaux, String date, double montantTransfer, @NotNull UserDTO refUser, Long sms,
			double frais) {
		super(borderaux, date, montantTransfer, refUser);
		this.sms = sms;
		this.frais = frais;
	}

	public Long getSms() {
		return sms;
	}

	public void setSms(Long sms) {
		this.sms = sms;
	}

	public double getFrais() {
		return frais;
	}

	public void setFrais(double frais) {
		this.frais = frais;
	}

	@Override
	public String toString() {
		return "In [sms=" + sms + ", frais=" + frais + ", toString()=" + super.toString() + "]";
	}

}
