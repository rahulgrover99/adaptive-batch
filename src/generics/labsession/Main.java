package generics.labsession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("1", "ParleG", 12.5, 11);
        Item item2 = new Item("2", "Dairy Milk", 6, 11);
        Item item3 = new Item("3", "Milk", 15, 10);

        List<Item> items = new ArrayList<>(List.of(item, item2, item3));
        Collections.sort(items);

//        System.out.println(items);


        Order order1 = new Order("123", Order.OrderType.STANDARD);
        Order order2 = new Order("345", Order.OrderType.EXPRESS);
        Order order3 = new Order("456", Order.OrderType.STANDARD);
        Order order4 = new Order("789", Order.OrderType.EXPRESS);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order3);

        System.out.println(orderProcessor.processOrder());

        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order4);

        System.out.println(orderProcessor.processOrder());
        System.out.println(orderProcessor.processOrder());

        Collections.sort(items, new ItemNameComparator());

        System.out.println(items);

    }
}
