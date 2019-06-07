package com.cashPlus.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="out_transaction")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="TYPE",discriminatorType = DiscriminatorType.STRING,length = 3)
public   class Out extends Fawatir {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Out(String borderaux, String date, double montantTransfer, @NotNull User refUser, double frais,
			double frais2) {
		super(borderaux, date, montantTransfer, refUser, frais);
		frais = frais2;
	}
	@Column(name = "frais")
	private double frais;
	public double getFrais() {
		return frais;
	}
	public void setFrais(double frais) {
		this.frais = frais;
	}
	@Override
	public String toString() {
		return "Out [frais=" + frais + ", toString()=" + super.toString() + "]";
	}
	



}
