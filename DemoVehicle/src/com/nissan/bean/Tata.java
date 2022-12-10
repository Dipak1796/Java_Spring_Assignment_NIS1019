package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.Vehicle;

@Component
public class Tata implements Vehicle {

	@Override
	public void carInfo() {

		System.out.println("Model : Nexon");
		System.out.println("Price :7.50-13.99 lakh");	
	}

}
