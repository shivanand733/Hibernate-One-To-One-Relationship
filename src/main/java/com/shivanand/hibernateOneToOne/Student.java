package com.shivanand.hibernateOneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  
@Column
	private String name;
@Column
	private String email;
@Column
	private int phone;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "addrId",referencedColumnName = "addrId")
	private Address addr;
	
	public Student() {
		//  default constreuctor 
		}

	public Student(int id, String name, String email, int phone, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
	}

	public Student(String name, String email, int phone, Address addr) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
	}

	public Student(String name, String email, int phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", addr=" + addr
				+ "]";
	}
	
	
}
