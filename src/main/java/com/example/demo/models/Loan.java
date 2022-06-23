package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;



import lombok.Data;

@Data
@Component
@Entity
public class Loan{
	
	@Id
	int l_id;
	int loan_number;
	int balance;
	String loan_type;
	
	public Loan()
	{
		
	}
	public Loan(int l_id, int loan_number, int balance, String loan_type) {
		super();
		this.l_id = l_id;
		this.loan_number = loan_number;
		this.balance = balance;
		this.loan_type = loan_type;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public int getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(int loan_number) {
		this.loan_number = loan_number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	

}
