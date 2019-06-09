package com.cashPlus.dto;

public class UserRoleDTO extends HistorizedDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -850535397791614574L;


	private RoleDTO refRole;

	
	private UserDTO refUser;


	public RoleDTO getRefRole() {
		return refRole;
	}


	public void setRefRole(RoleDTO refRole) {
		this.refRole = refRole;
	}


	public UserDTO getRefUser() {
		return refUser;
	}


	public void setRefUser(UserDTO refUser) {
		this.refUser = refUser;
	}
	
	
}
