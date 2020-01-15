package com.distribuida.dto;

import java.io.Serializable;
import java.util.Date;

public class Singer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	/*
	 * private Integer id; private String first_name; private String last_name;
	 * private Date birth_date; private Integer version;
	 * 
	 * public Integer getId() { return id; }
	 * 
	 * public void setId(Integer id) { this.id = id; }
	 * 
	 * public String getFirst_name() { return first_name; }
	 * 
	 * public void setFirst_name(String first_name) { this.first_name = first_name;
	 * }
	 * 
	 * public String getLast_name() { return last_name; }
	 * 
	 * public void setLast_name(String last_name) { this.last_name = last_name; }
	 * 
	 * public Date getBirth_date() { return birth_date; }
	 * 
	 * public void setBirth_date(Date birth_date) { this.birth_date = birth_date; }
	 * 
	 * public Integer getVersion() { return version; }
	 * 
	 * public void setVersion(Integer version) { this.version = version; }
	 */

}
