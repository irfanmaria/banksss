package com.example.demo.models;




import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Component

@Data

@Entity
public class Bank{

	

	@Id
	int band_id;
	

	String bank_name;
	
	@OneToMany
	List<Branch> branch;
	
	public Bank()
	{
	}
	
	public Bank(int band_id, String bank_name, List<Branch> branch) {
		super();
		this.band_id = band_id;
		this.bank_name = bank_name;
		this.branch = branch;
	}
	
	
	
}
