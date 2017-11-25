package com.actionbazaar.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="euser")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class User {
	
	@Id
	@Column(name="user_id")
	private Long userId;
	private String firstName;
	private String lastName;
	@Column(name="birth_date")
	private Date birthDate;
	private String username;
	private String password;
	private String email;
	
	//@OneToOne
	//private Address address; 
	
	public User() {

	}



	public User(Long userId, String firstName, String lastName, Date birthDate, String username, String password,
			String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.username = username;
		this.password = password;
		this.email = email;
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
		

}
