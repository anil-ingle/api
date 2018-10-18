package com.krushidj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "CONTACT")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private long id;

	@Type(type = "string")
	@Column(name = "avatarPath", nullable = true)
	private String avatarPath;

	@Type(type = "string")
	@NotNull
	@Column(name = "firstName", nullable = false)
	private String firstName;

	@Type(type = "string")
	@NotNull
	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Type(type = "string")
	@NotNull
	@Column(name = "mobileNumber", nullable = false)
	private String mobileNumber;

	@Type(type = "string")
	@Column(name = "home", nullable = false)
	private String home;

	@Type(type = "string")
	@Column(name = "company", nullable = false)
	private String company;

	@Type(type = "string")
	@Column(name = "work", nullable = false)
	private String work;

	@Type(type = "string")
	@Column(name = "text", nullable = false)
	private String text;

	@Column(name = "loginId")
	private long loginId;

	@Column(name = "active")
	private boolean active;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAvatarPath() {
		return avatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getLoginId() {
		return loginId;
	}

	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", avatarPath=" + avatarPath + ", firstName=" + firstName + ", lastName="
				+ lastName + ", mobileNumber=" + mobileNumber + ", home=" + home + ", company=" + company + ", work="
				+ work + ", text=" + text + ", loginId=" + loginId + ", active=" + active + "]";
	}

}
