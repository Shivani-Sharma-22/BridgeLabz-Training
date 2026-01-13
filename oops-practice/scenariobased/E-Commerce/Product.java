
public class Product {
	protected String productName;
	protected int prodID;
	protected double prodPrice;
	protected boolean isAvailable = true;
	
	Product(String productName,int prodID,double prodPrice){
		this.productName = productName;
		this.prodID = prodID;
		this.prodPrice = prodPrice;
	}
	public void display() {
		System.out.println("Product Name: "+ productName);
		System.out.println("Product-ID: "+ prodID);
		System.out.println("Product Price: "+ prodPrice);
		
	}
	
}
