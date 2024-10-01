package class1.ex;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public ProductOrder() {
    }

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "상품명: " + this.productName + ", 가격: " + this.price + ", 수량: " + this.quantity;
    }
}
