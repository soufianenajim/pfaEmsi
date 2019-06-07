package com.cashPlus.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name="user_role")
public class UserRole extends Historized{
	/**
	 * 
	 */
	private static final long serialVersionUID = -850535397791614574L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REF_ROLE")
	@NotNull
	private Role refRole;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REF_USER")
	@NotNull
	private User refUser;
}
