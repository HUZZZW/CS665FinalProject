package edu.bu.met.cs665.finalProject;

public class ConcreteOrderObserver implements OrderObserver {
    private String observerName;
    public ConcreteOrderObserver(String observerName){
        this.observerName = observerName;
    }
    @Override
    public void update(Order order) {
        System.out.println("_________________________________________________________");
        System.out.println("you are "+this.observerName+" please Keep looking after massage!");
        System.out.println("received the order update. Product: " + order.getProduct());
        System.out.println("Discount "  + order.getDiscount());
        System.out.println("Payment method: " + order.getPaymentMethod());
        System.out.println("Order Create Time: " + order.getOrderTime());
        System.out.println("Delivery Address: " + order.getOrderAddress());
        System.out.println("Order phone number: " + order.getPhoneNumber());
        System.out.println("_________________________________________________________");
    }
}
