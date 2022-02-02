package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Address 
{
	
private int addressline;
private String city;


public int getAddressline() {
	return addressline;
}
public void setAddressline(int addressline) {
	this.addressline = addressline;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address(int addressline, String city) {
	super();
	this.addressline = addressline;
	this.city = city;
}


public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [addressline=" + addressline + ", city=" + city + "]";
}
}
