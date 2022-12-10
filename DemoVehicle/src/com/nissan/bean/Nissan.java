package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.Vehicle;

@Component
public class Nissan implements Vehicle {

	@Override
	public void carInfo() {

		System.out.println("Model : Magnite");
		System.out.println("Price :5.99-7.80 lakh");
		
	}

}
