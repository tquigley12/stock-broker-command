package command;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the Invoker: it executes the Commands.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
   
        orderList.clear();
    }
    
    /**
     * Undo Stack in the Invoker class
     */
    public void undo() {
        if (!orderList.isEmpty()) {
            orderList.remove(orderList.size() - 1).undo();
        }
    }

}
