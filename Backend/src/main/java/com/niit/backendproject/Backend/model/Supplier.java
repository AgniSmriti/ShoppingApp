package com.niit.backendproject.Backend.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplier {
	
	@Id
	private String supId;
	
	@Column(unique=true)
	private String supName; 
    
	@OneToMany(mappedBy = "supplier", fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    public Set<Product> product;
	
public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

public String getSupId() {
		return supId;
	}

	public void setSupId(String supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}
	
}
