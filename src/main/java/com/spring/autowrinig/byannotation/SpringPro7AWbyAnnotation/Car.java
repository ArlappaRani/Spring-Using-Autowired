package com.spring.autowrinig.byannotation.SpringPro7AWbyAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("d3")
	Driver dr;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(Driver dr) {
		super();
		this.dr = dr;
		System.out.println("Constructor got executed");
	}

	public Driver getDr() {
		return dr;
	}

	public void setDr(Driver dr) {
		this.dr = dr;
		System.out.println("Setter method got executed");
	}

	@Override
	public String toString() {
		return "Car [dr=" + dr + "]";
	}
	

}
