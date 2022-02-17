public class ObjectMemory
{
	public static void main(String ar[])
	{
		Product p1 = new Product();
		p1.setProduct(121, 2000.20, 5);
		p1.showProduct();
	}
}
class Product
{
	int id;
	double price;
	int quantity;
	double totalCost;
	public void setProduct(int i, double p, int q) {
		id = i;
		price = p;
		quantity = q;
		totalCost = p * q;
	}
	public void showProduct() {
		int id = 200; // shadowing of variable 
		System.out.println(id);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(totalCost);
	}
}

