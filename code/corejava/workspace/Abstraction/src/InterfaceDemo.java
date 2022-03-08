
public class InterfaceDemo {
	public static void main(String[] args) {
		Vehicle vehicle = new Abc();
		vehicle.brandName();
		vehicle.fuelType();
		vehicle.noOfWheels();
	}
}

interface Vehicle {
	int a = 10;
	void brandName();
	void noOfWheels();
	void fuelType();
}

// Car IS-A Vehicle
abstract class Car1 implements Vehicle {
	@Override
	public void noOfWheels() {
		System.out.println("There are 4 wheels and 2 spare wheel..");
	}
}

class Abc extends Car1 {
	@Override
	public void brandName() {
		System.out.println("Xyz Brand..");
	}

	@Override
	public void fuelType() {
		System.out.println("Fuel Type is Petrol..");
	}
}
