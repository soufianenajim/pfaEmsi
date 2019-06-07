package com.cashPlus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "neosurf_express")

public class NeoSurfPayExpress extends Transaction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public NeoSurfPayExpress(String borderaux, String date, double montantTransfer, @NotNull User refUser) {
		super(borderaux, date, montantTransfer, refUser);
		// TODO Auto-generated constructor stub
	}
	@Column(name = "num_commande")
	private String numCommande;
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
