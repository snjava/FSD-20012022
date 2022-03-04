
public class RuntimePloymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		Tiger t = new Tiger();
		Goat g = new Goat();
		showAnimalProperties(t);
	}
	public static void showAnimalProperties(Animal animal) { 
		animal.eat();
	}
}
class Animal {
	public void eat() {
		System.out.println("Animal eats Veg and non-Veg");
	}
}
class Cat extends Animal {
	
}
class Goat extends Animal {
	@Override
	public void eat() {
		System.out.println("Goat eats Veg");
	}
}
class Tiger extends Animal {
	public void eat() {
		System.out.println("Tiger eats Non-Veg");
	}
}
