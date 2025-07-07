package generics.labsession;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {

    private Queue<Order> orders;

    public OrderProcessor() {
        this.orders = new PriorityQueue<>();
    }

    public Order processOrder() {
        return orders.poll();
    }

    public void addOrder(Order order) {
        orders.offer(order);
    }
}
