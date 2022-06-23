package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class Account {
	
    @Id
	int a_id;
	int account_number;
	@Enumerated(EnumType.STRING)
	@Column(name="Account_type")
	private Accout_type type;
	@ManyToOne
	private Customers c_id;
	
	
	public Account(int a_id, int account_number, Accout_type type) {
		super();
		this.a_id = a_id;
		this.account_number = account_number;
		this.type = type;
	}
	
	public Account()
	{
		
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public Accout_type getType() {
		return type;
	}

	public void setType(Accout_type type) {
		this.type = type;
	}
	
}
