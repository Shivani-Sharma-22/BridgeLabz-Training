package BridgeLabz_Day39_LambdaExpressions;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    void show() {
        System.out.println("Invoice created for : " + transactionId);
    }
}
