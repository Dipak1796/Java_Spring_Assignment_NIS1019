package com.nissan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.Vehicle;

public class DemoVehicleTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
				

		Vehicle car=context.getBean("nissan",Vehicle.class);
		car.carInfo();
	}

}
