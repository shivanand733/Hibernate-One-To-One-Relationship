package com.shivanand.hibernateOneToOne;

public class Address {
	private int  addrId;
	private String street;
	private String city;
	private String state;
	private int pincode;
	
	public Address() {
		//defaultconstructor 
	}
	
	public Address(String street,String city, String state,int pincode ) {
		this.street = street;
	}
}
