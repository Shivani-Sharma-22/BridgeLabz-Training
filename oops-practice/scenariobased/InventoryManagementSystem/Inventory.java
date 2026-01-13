package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory  {
	private List<Product> prod = new ArrayList<>();
	private AlertService alertService;
	
	// Inventory receives AlertService
	public Inventory(AlertService alertService) {
	    this.alertService = alertService;
	}
    //add product
	public void addProduct(Product product) {
		prod.add(product);
		System.out.println("Product added: " + product.getProductName());
	}
	//update product
	 public void updateProductStock(int productId, int amount)
	            throws OutOfStockException {

	        for (Product product : prod) {
	            if (product.getProdId() == productId) {

	                // product handles stock logic
	                product.updateStock(amount);

	                // inventory triggers alert
	                alertService.sendAlert(product);
	                return;
	            }
	        }
	        throw new IllegalArgumentException("Product not found");
	    }

	//check stock
	public void checkStock(int productId) {
		for(Product product: prod) {
			if(product.getProdId() == productId ) {
				System.out.println("Stock for "+ product.getProductName() +": "
						+ product.getStock());
				return;
			}
		}
		System.out.println("Product not found.");
	}
	// remove stock
	public void removeStock(int productId) {
		prod.removeIf(p -> p.getProdId() == productId);
		System.out.println("Product removed.");
	}
}
