package com.capgemini.spring.model;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class Address {

@Value("Mumbai")
private String city;

@Value("410203")
private int pincode;

@Value("Maharashtra")
private String state;

	public Address()
	 {
		super();
	 }

	public Address(String city, int pincode, String state)
	 {
		super();
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public String getCity() 
	{
		return city;
	}


	public void setCity(String city)
	 {
		this.city = city;
	}

	public int getPincode() 
	{
		return pincode;
	}

	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state)
	 {
		this.state = state;
	 }

	@Override
	public String toString()
	 {

		return "Address [city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	 }

}
