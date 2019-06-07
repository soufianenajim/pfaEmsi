package com.cashPlus.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name = "user")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User extends Historized {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7263208288016824088L;

	@Column(name = "LOGIN", length = 30)
	@NotNull
	private String login;

	@Column(name = "PASSWORD", length = 255)
	@NotNull
	private String password;
	
	@Column(name = "first_name", length = 100)
	private String firstName;

	@Column(name = "last_name", length = 100)
	private String lastName;

	@Lob
	@Column(name = "TOKEN", length = 512)
	private String token;

	@Column(name = "TOKEN_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tokenDate;

	@Column(name = "IS_ONLINE")
	@NotNull
	private Boolean isOnline = false;

	@Column(name = "IS_OFFLINE")
	@NotNull
	private Boolean isOffline = false;
	
	@OrderBy("ID DESC")
	@OneToMany(mappedBy = "refUser")
	private Collection<UserRole> useRoles;
     
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(@NotNull String login, @NotNull String password, @NotNull Boolean isOnline,
			@NotNull Boolean isOffline) {
		super();
		this.login = login;
		this.password = password;
		this.isOnline = isOnline;
		this.isOffline = isOffline;
	}
	

	public User(@NotNull String login, @NotNull String password, String firstName, String lastName, String token,
			Date tokenDate, @NotNull Boolean isOnline, @NotNull Boolean isOffline) {
		super();
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

	public Collection<UserRole> getUseRoles() {
		return useRoles;
	}

	public void setUseRoles(Collection<UserRole> useRoles) {
		this.useRoles = useRoles;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", token=" + token + ", tokenDate=" + tokenDate
				+ ", isOnline=" + isOnline + ", isOffline=" + isOffline +  ", toString()="
				+ super.toString() + "]";
	}


	
}
