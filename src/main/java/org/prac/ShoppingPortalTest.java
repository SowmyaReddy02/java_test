package org.prac;


class ShoppingPortal{
    public void makePayment(String username, String password){
        System.out.println("Internet Banking");
    }
    public void makePayment(long mobile, int password){
        System.out.println("UPI");
    }
    public void makePayment(long creditCard, int cvv, String name, String expireDate){
        System.out.println("Credit or Debit");
    }
}
public class ShoppingPortalTest {
    public static void main(String[] args) {
        ShoppingPortal shoppingPortal = new ShoppingPortal();
        shoppingPortal.makePayment(123456789,1234);
        shoppingPortal.makePayment("sow", "chan");
        shoppingPortal.makePayment(41234, 123, "sow", "12/12");
    }
}
