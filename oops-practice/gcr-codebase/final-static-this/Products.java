
class Products {
    static double discount = 10.0;

    final String productID;
    String productName;
    double price;
    int quantity;

    Products(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct() {
        if (this instanceof Products) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", ID: " + productID);
        }
    }
    //main method
    public static void main(String[] args) {
        Products p1 = new Products("Laptop", 65000, 2, "P101");
        Products p2 = new Products("Mobile", 25000, 5, "P102");
        Products p3 = new Products("Headphones", 3000, 10, "P103");

        System.out.println("Before Discount Update:");
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        // update static discount
        Products.updateDiscount(15.0);

        System.out.println("\nAfter Discount Update:");
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
    }
}

