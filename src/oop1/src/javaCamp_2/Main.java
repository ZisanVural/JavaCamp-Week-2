package javaCamp_2;

public class Main {
	
	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitInStock(4);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitInStock(2);
		product3.setImageUrl("image2.jpg");
		
		Product[] products = { product1, product2, product3 };
		
		for (Product product : products) {
			System.out.println("Unit prices: " + product.getUnitPrice());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("055678905");
		individualCustomer.setCustomerNumber("123123456");
		individualCustomer.setFirstName("Zisan");
		individualCustomer.setLastName("Vural");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("NEXT LTD STI");
		corporateCustomer.setPhoneNumber("05334567");
		corporateCustomer.setTaxNumber("23456786789");
		corporateCustomer.setCustomerNumber("123123457");
		
		Customer[] customers = { individualCustomer, corporateCustomer };
		
		for (Customer customer : customers) {
			System.out.println("Customer phone number:" + customer.getPhoneNumber());
		}
	}
}
