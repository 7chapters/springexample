package info._7chapters.spring.annotation.vehicle.fourwheel;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car(){
		System.out.println("Car.Car()" + this);
	}
}
