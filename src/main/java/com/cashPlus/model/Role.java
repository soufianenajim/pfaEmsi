package com.cashPlus.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends Historized {

	private static final long serialVersionUID = -8858004000210805400L;

	
	@Column(name = "role_name")
	private String roleName;
	
	@OrderBy("ID DESC")
	@OneToMany(mappedBy = "refRole")
	private Collection<UserRole> useRoles;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Collection<UserRole> getUseRoles() {
		return useRoles;
	}

	public void setUseRoles(Collection<UserRole> useRoles) {
		this.useRoles = useRoles;
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", useRoles=" + useRoles + ", toString()=" + super.toString() + "]";
	}

	

	


	

	
}
