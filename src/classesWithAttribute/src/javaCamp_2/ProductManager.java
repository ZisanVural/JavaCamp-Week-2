package javaCamp_2;

public class ProductManager {
	
	public void Add(Product product) {
		System.out.println("Product added: " + product.getName());
	}

//overloading 
	public void Add(int id, String name, String description, double price, int stockAmount, String colour,
			String code) {
	}
}
