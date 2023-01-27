package javaCamp_2;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "HP Laptop", 4500, 100, "grey", "4567834590L");

		ProductManager productManager = new ProductManager();

		productManager.Add(product);

		System.out.println(product.getColour());
}
}
