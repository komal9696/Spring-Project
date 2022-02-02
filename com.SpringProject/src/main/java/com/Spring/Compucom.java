package com.Spring;
import org.springframework.beans.factory.annotation.Autowired;

public class Compucom
{
@Autowired
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Compucom() {
	super();
	// TODO Auto-generated constructor stub
}
}
