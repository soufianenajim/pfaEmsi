package com.cashPlus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "eau_electricite")
public class EauElectricite extends Fawatir {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	public EauElectricite(String borderaux, String date, double montantTransfer, @NotNull User refUser, double frais,
			String numFacture) {
		super(borderaux, date, montantTransfer, refUser, frais);
		this.numFacture = numFacture;
	}

	@Column(name = "num_facture")
	private String numFacture;

	public String getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}

}
