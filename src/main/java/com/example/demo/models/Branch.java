package com.example.demo.models;





import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class Branch {

	@Id
	int b_id;
	
	String branch_name;
	String address;
	int phone_number;
	
	@OneToMany
	List<Customers> customer;
	
	@OneToMany
	List<Employeess> employee;
	
	@ManyToOne
	private Bank bank_id;
	
	
	
	
	public Branch()
	{
	}




	public Branch(int b_id, String branch_name, String address, int phone_number, List<Customers> customer,
			List<Employeess> employee, Bank bank_id) {
		super();
		this.b_id = b_id;
		this.branch_name = branch_name;
		this.address = address;
		this.phone_number = phone_number;
		this.customer = customer;
		this.employee = employee;
		this.bank_id = bank_id;
	}
	
	
	
	
	
}
