package com.shivanand.hibernateOneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "addres")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  addrId;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;
	
	
	public Address() {
		//defaultconstructor 
	}
	
	public Address(String street,String city, String state,int pincode ) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	
	
	public Address(int addrId, String street, String city, String state, int pincode) {
		this.addrId = addrId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	@Override
	public String toString() {
		return "Address (addrId=" + addrId + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ")";
	}
	
	
	
}
