package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class Employeess {

	
	


	@Id
	int e_id;
	String name;
	String email;
	String address;
	
	@ManyToOne
	private Branch b_id;
	
	
	
	public Employeess()
	{
		
	}
	public Employeess(int e_id, String name, String email, String address) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	
}
