import java.util.List;
import java.util.*;
class ProductOutOfStock extends Exception {
	ProductOutOfStock(String message){
		super(message);
	}
}
class Product{
	int prodId;
	String name;
	
	public Product(int prodId, String name) {
		this.prodId = prodId;
		this.name = name;
	}
}
public class CustomException {
	public static void main(String[] args)throws ProductOutOfStock {
		Scanner sc = new Scanner(System.in);
		
		int quantity = 3;
		System.out.print("Enter quantity you want to purchase: ");
		int check = sc.nextInt();
		try {
			if(check >quantity) {
				throw new ProductOutOfStock("Product out of stock Available quantity: "+quantity);
			}
			else {
                System.out.println("Order placed successfully!");
            }
		}
		catch(ProductOutOfStock e) {
			System.out.println(e.getMessage());
		}
	}
}
