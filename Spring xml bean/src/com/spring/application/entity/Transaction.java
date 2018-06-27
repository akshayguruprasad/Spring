package com.spring.application.entity;

import java.util.Date;

public class Transaction {

	private int id;
	private String merchant;
	private Date transactionDate;
	private double amount;

	public Transaction() {
		System.out.println("Inside the Transaction constructor");
	}

	public Transaction(int id, String merchant, Date transactionDate, double amount) {
		System.out.println("Inside the Transaction param constructor");
		this.id = id;
		this.merchant = merchant;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", merchant=" + merchant + ", transactionDate=" + transactionDate + ", amount="
				+ amount + "]";
	}

}
