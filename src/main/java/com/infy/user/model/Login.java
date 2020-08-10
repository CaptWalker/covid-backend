package com.infy.user.model;

public class Login {
	private String email;
	private String password;
	private boolean docStatus;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isDocStatus() {
		return docStatus;
	}
	public void setDocStatus(boolean docStatus) {
		this.docStatus = docStatus;
	}
}
