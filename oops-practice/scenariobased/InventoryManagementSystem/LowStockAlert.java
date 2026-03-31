package InventoryManagementSystem;

public class LowStockAlert implements AlertService {

    private static final int LOW_STOCK_LIMIT = 5;

    @Override
    public void sendAlert(Product product) {
        if (product.getStock() <= LOW_STOCK_LIMIT) {
            System.out.println(
                "⚠ LOW STOCK ALERT: " +
                product.getProductName() +
                " (Remaining: " + product.getStock() + ")"
            );
        }
    }
}
