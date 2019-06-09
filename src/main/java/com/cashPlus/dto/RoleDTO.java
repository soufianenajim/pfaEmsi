package com.cashPlus.dto;

import java.util.Collection;


public class RoleDTO extends HistorizedDTO {

	private static final long serialVersionUID = -8858004000210805400L;

	
	
	private String roleName;
	
	
	private Collection<UserRoleDTO> useRoles;
	
	

	public RoleDTO(String roleName) {
		super();
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Collection<UserRoleDTO> getUseRoles() {
		return useRoles;
	}

	public void setUseRoles(Collection<UserRoleDTO> useRoles) {
		this.useRoles = useRoles;
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", useRoles=" + useRoles + ", toString()=" + super.toString() + "]";
	}

	

	


	

	
}
