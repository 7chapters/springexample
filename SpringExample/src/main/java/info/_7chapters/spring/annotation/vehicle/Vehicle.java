package info._7chapters.spring.annotation.vehicle;

import info._7chapters.spring.annotation.vehicle.fourwheel.Car;
import info._7chapters.spring.annotation.vehicle.twowheel.Bike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {
	private Car car;
	private Bike bike;
	public Vehicle() {
		System.out.println("Vehile.enclosing_method() "+ this);
	}
	public Car getCar() {
		return car;
	}
	@Autowired
	public void setCar(Car car) {
		System.out.println("Vehicle.setCar()");
		this.car = car;
	}
	public Bike getBike() {
		return bike;
	}
	@Autowired
	public void setBike(Bike bike) {
		System.out.println("Vehicle.setBike()");
		this.bike = bike;
	}
}
