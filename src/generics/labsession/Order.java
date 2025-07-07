package generics.labsession;

public class Order implements Comparable<Order> {

    private String orderId;

    @Override
    public int compareTo(Order order) {
        if (!this.orderType.equals(order.orderType)) {
            if (this.orderType == OrderType.EXPRESS) {
                // if we want this order to come first -> return -1
                return -1;
            } else {
                return 1;
            }
        }
        return this.orderId.compareTo(order.orderId);
    }

    public enum OrderType {
        STANDARD,
        EXPRESS
    }

    private OrderType orderType;

    public Order(String orderId, OrderType orderType) {
        this.orderId = orderId;
        this.orderType = orderType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderType=" + orderType +
                '}';
    }
}
