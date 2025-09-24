package pillars.Inheritance;
class Order{
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }
    void display(){
        System.out.println(getOrderId());
        System.out.println(getOrderDate());
        System.out.println(getTrackingNumber());
        System.out.println(deliveryDate);
    }
}

public class OROM {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(1, "2023-10-01", "TRACK123", "2025-10-05");
        order.display();
    }
}
