package com.mncindia.spring;

public class Address {
	private String city;
	private String street;
	private String state;
	public Address(String city, String street, String state) {
		System.out.println("Address-3-args");
		this.city = city;
		this.street = street;
		this.state = state;
	}
	public String toString() {
		return ""+city+"\t"+state+"\t"+street;

	}

}
