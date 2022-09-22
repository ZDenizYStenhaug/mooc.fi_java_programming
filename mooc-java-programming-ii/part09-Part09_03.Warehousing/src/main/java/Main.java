

public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee",10,5);
        pwh.addToWarehouse(1);
        pwh.addToWarehouse(1);
        pwh.addToWarehouse(1);
        pwh.addToWarehouse(1);
        System.out.println(pwh.history());
    }

}
