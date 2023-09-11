package test;

public class Order {
    private int orderId;
    private String customerName;
    private float orderAmount;
    private String paymentOption;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(float orderAmount) throws InvalidOrderException {
        if(orderAmount>100){
            this.orderAmount = orderAmount;
        }
        else {
            throw new InvalidOrderException("Invalid Data");
        }
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) throws InvalidOrderException{
        if("COD".equalsIgnoreCase(paymentOption)||"Gift Card".equalsIgnoreCase(paymentOption)||"Internet Banking".equalsIgnoreCase(paymentOption)){
            this.paymentOption = paymentOption;
        }
        else{
            throw new InvalidOrderException("Invalid Data");
        }
    }

    public Order(int orderId, String customerName, float orderAmount, String paymentOption) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.paymentOption = paymentOption;
    }
}
