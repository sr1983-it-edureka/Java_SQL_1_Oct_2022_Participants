package com.edureka.javasql1.hibernate.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "address")
@Entity(name = "jAddress")
public class Address {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "address_info")
	private String addressInformation;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")	
	private String state;
	
	@Column(name = "pincode")
	private int pincode;
	
	public Address() {
		
	}
	
	public Address(String addressInformation, String city, String state, int pincode) {
	
		this.addressInformation = addressInformation;
		this.city  =city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddressInformation() {
		return addressInformation;
	}
	public void setAddressInformation(String addressInformation) {
		this.addressInformation = addressInformation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String toString() {
		
		return String.format(
			"Id is %d, Add Info is %s, City %s, State %s, Pincode %d", 
			id, addressInformation, city, state, pincode);
	}
}
