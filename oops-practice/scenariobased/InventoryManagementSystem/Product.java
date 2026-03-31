package InventoryManagementSystem;

public class Product {
	private int prodId;
	private String productName;
	private int quantity;
	
	
	public Product(int prodId,String productName, int quantity) {
		this.prodId = prodId;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	public int getStock()  {
		if(quantity == 0)  {
			System.out.println("Product out of stock");
		}
		return quantity;
	}
	public void updateStock(int amount) throws OutOfStockException{
		if((quantity + amount) < 0 ) {
			throw new OutOfStockException("Insufficient stock for product: "+getProductName());
		}
		quantity = quantity+amount;
		System.out.println("Updated Stock for: "+ productName +": "+ quantity);
	}
	public int getProdId() {
		return prodId;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getProductName() {
		return productName;
	}
	
}
