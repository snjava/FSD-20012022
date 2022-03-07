public class AsbtractClassDemo {
	public static void main(String[] args) {
		
		Car.info();
		
		Car car = new AudiA8Ev();
		car.brandName();
		car.fuelType();
		car.noOfWheels();
	}
}

abstract class Car {
	public Car() {
		System.out.println("Car class Constrcutor");
	}
	protected abstract void brandName();
	public abstract void fuelType();
	public final void noOfWheels() {
		System.out.println("There are 4 wheels and 1 spare wheel");
	}
	public static void info() {
		System.out.println("This is a car car...");
	}
}

abstract class Audi extends Car {
	public void brandName() {
		System.out.println("Brand : Audi");
	}
	public abstract void engine();
}

class AudiA8Ev extends Audi {
	public void fuelType() {
		System.out.println("Fule Type : Electric");
	}

	@Override
	public void engine() {
		System.out.println("Audi A8 has a electirc Engine...");
	}
}