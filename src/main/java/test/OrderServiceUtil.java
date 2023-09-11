package test;

import java.util.Set;
import java.util.TreeMap;

public class OrderServiceUtil {
    Order ord;
    TreeMap<Integer, Order> treeMap = new TreeMap();
    public void addOrder(Order order) throws InvalidOrderException {
        if(order.getOrderAmount()>100&&"COD".equalsIgnoreCase(order.getPaymentOption())||
                "Gift Card".equalsIgnoreCase(order.getPaymentOption())||
                "Internet Banking".equalsIgnoreCase(order.getPaymentOption())){
             treeMap.put(order.getOrderId(),order);
          System.out.println("Order added");
     }else {
            throw new InvalidOrderException("Invalid Data");
        }
    }

    public Order search(int orderId){
        System.out.print(treeMap.get(orderId).getOrderId());
        System.out.print(treeMap.get(orderId).getCustomerName());
        System.out.print(treeMap.get(orderId).getOrderAmount());
        System.out.print(treeMap.get(orderId).getPaymentOption());
        return treeMap.get(orderId);
    }

    public float findTotal(){
        System.out.println(treeMap.values());
        int totalMarks = 0;
        for (Order order : treeMap.values()) {
            totalMarks += order.getOrderAmount();
        }

        System.out.println(totalMarks);
        return totalMarks;
    }

}
