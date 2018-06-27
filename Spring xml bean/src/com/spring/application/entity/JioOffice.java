package com.spring.application.entity;

public class JioOffice {

	private User simpleParamUser;

	public JioOffice() {
		System.out.println("Inside the default constructor of JioOffice");
	}

	public JioOffice(User simpleParamUser) {

		System.out.println("Inside the param constructor of jiooffice");
		this.simpleParamUser = simpleParamUser;
	}

	public User getSimpleParamUser() {
		return simpleParamUser;
	}

	public void setSimpleParamUser(User simpleParamUser) {
		this.simpleParamUser = simpleParamUser;
	}

	@Override
	public String toString() {
		return "JioOffice [simpleParamUser=" + simpleParamUser + "]";
	}

	
}
