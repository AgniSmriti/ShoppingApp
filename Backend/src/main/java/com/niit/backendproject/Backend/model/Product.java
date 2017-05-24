package com.niit.backendproject.Backend.model; 

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;
 
@Entity
@Table(name = "PRODUCT")
public class Product {
    
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int proId;
	
	@Column(unique=true)
    private String proName;
    
    private String catId;
    private String supId;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "catId",insertable=false,nullable=false,updatable=false)
    private Category category;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "supId",insertable=false,nullable=false,updatable=false)
    private Supplier supplier;
    
    @Transient
     private MultipartFile image;



	public int getProId() {
		return proId;
	}

	





	public String getProName() {
		return proName;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}



	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getCatId() {
		return catId;
	}

	


	public void setCatId(String catId) {
		this.catId = catId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}







	public String getSupId() {
		return supId;
	}







	public void setSupId(String supId) {
		this.supId = supId;
	}







	public Supplier getSupplier() {
		return supplier;
	}







	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}







	public MultipartFile getImage() {
		return image;
	}







	public void setImage(MultipartFile image) {
		this.image = image;
	}







    
    
 
}