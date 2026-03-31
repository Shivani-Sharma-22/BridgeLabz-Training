package InventoryManagementSystem;

public class InventoryApp {

    public static void main(String[] args) {

        // 1️ Create Alert Service (interface reference)
        AlertService alertService = new LowStockAlert();

        // 2️ Create Inventory and inject alert service
        Inventory inventory = new Inventory(alertService);

        // 3️ Create Products
        Product p1 = new Product(101, "Keyboard", 10);
        Product p2 = new Product(102, "Mouse", 4);

        // 4️ Add products to inventory
        inventory.addProduct(p1);
        inventory.addProduct(p2);

        // 5 check stock
        inventory.checkStock(101);
        inventory.checkStock(102);

        // 6 update stock
        try {
            inventory.updateProductStock(101, -3); // reduces stock
            inventory.updateProductStock(102, -2); // triggers low stock alert
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 7️ Check stock again
        inventory.checkStock(101);
        inventory.checkStock(102);

        // 8️ Out-of-stock scenario
        try {
            inventory.updateProductStock(102, -10); // exception
        } catch (OutOfStockException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // 9️ Remove product
        inventory.removeStock(101);
        inventory.checkStock(101);
    }
}
