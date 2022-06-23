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
public class Customers {

	@Id
	int c_id;
	String name;
	

	String email;
	String city;
	String phone;
	@OneToMany
	List<Account> account;
	
	@ManyToOne
	private Branch b_id;
	
	
	
	public Customers()
	{
		
	}



	public int getC_id() {
		return c_id;
	}



	public void setC_id(int c_id) {
		this.c_id = c_id;
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



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Customers(int c_id, String name, String email, String city, String phone, List<Account> account,
			Branch b_id) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.phone = phone;
		this.account = account;
		this.b_id = b_id;
	}
	
	
		
	
	
}
