package com.spring.application.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

	private String name;
	private List<Transaction> customerTransactions;
	private Map<String, String> password = new HashMap<String, String>();

	public User() {
		System.out.println("Inside the User default constructor ");
	}

	public User(String name, List<Transaction> customerTransactions, Map<String, String> password) {

		System.out.println("Inside the User param constructor");
		this.name = name;
		this.customerTransactions = customerTransactions;
		this.password = password;
	}

	public Map<String, String> getPassword() {
		return password;
	}

	public void setPassword(Map<String, String> password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Transaction> getCustomerTransactions() {
		return customerTransactions;
	}

	public void setCustomerTransactions(List<Transaction> customerTransactions) {
		this.customerTransactions = customerTransactions;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", customerTransactions=" + customerTransactions + ", password=" + password + "]";
	}

}
