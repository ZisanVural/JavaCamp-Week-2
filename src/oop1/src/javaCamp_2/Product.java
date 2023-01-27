package javaCamp_2;

public class Product {
	
	// we do not define the product, we prepare the environment that can describe it
	// created a template
	// field | attribute
	
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitInStock;

	// getter
	public String getName() { // get is for readonly
		return name;
	}

	// setter
	public void setName(String name) { // set is for assign a set value
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
}
