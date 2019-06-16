package com.cashPlus.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.cashPlus.model.Role;

public class UserDTO extends HistorizedDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7263208288016824088L;

	private String login;

	private String password;

	private String firstName;

	private String lastName;

	private String token;

	private Date tokenDate;

	private Boolean isOnline = false;

	private Boolean isOffline = false;

    private Set<Role> roles = new HashSet<>();

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(Long id, Date createdAt, Date updatedAt, String login, String password, String firstName,
			String lastName, String token, Date tokenDate, Boolean isOnline, Boolean isOffline) {
		super(id, createdAt, updatedAt);
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.token = token;
		this.tokenDate = tokenDate;
		this.isOnline = isOnline;
		this.isOffline = isOffline;
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getTokenDate() {
		return tokenDate;
	}

	public void setTokenDate(Date tokenDate) {
		this.tokenDate = tokenDate;
	}

	public Boolean getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public Boolean getIsOffline() {
		return isOffline;
	}

	public void setIsOffline(Boolean isOffline) {
		this.isOffline = isOffline;
	}



	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", token=" + token + ", tokenDate=" + tokenDate
				+ ", isOnline=" + isOnline + ", isOffline=" + isOffline + ", toString()=" + super.toString() + "]";
	}

}
