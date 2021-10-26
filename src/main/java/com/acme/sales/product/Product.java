package com.acme.sales.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;

//import com.acme.sales.vendor.Vendor;

@Entity(name = "products")
public class Product {
	
	// Primary Key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, nullable=false )
	private String partNbr;
	
	@Column(length=30, nullable=false)
	private String name;
	
	private int price;
	
	@Column(length=30, nullable=false)
	private String unit;
	
	@Column(length=255, nullable=true)
	private String photoPath;
	
	// Foreign Key
//	@ManyToOne(optional=false)
//	@JoinColumn(name="vendorId")
//	public Vendor vendor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartNbr() {
		return partNbr;
	}

	public void setPartNbr(String partNbr) {
		this.partNbr = partNbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

//	public Vendor getVendor() {
//		return vendor;
//	}
//
//	public void setVendor(Vendor vendor) {
//		this.vendor = vendor;
//	}
	
}
