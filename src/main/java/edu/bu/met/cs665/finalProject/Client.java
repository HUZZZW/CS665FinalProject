package edu.bu.met.cs665.finalProject;
/**
 * @Name: Yiming Hu
 * @Date: Apr 27 2023
 * @Assaginment: Final project
 * @Description: The Client class is a class used to control the operation of the entire project, and we instantiate the objects we need in this class.
 * */
public class Client {
    public static void main(String[] args) {
        // Create an observer object
        OrderObserver Seller = new ConcreteOrderObserver("Seller");
        OrderObserver finance = new ConcreteOrderObserver("Finance man");
        OrderObserver DeliveryMan = new ConcreteOrderObserver("Delivery man");

        // Create a subject object
        ConcreteOrderSubject orderSubject = new ConcreteOrderSubject();

        //add to the notification list
        orderSubject.addObserver(Seller);
        orderSubject.addObserver(finance);
        orderSubject.addObserver(DeliveryMan);

        // Using builder pattern to create an order
        OrderBuilder orderBuilder = new ConcreteOrderBuilder();
        Order order = orderBuilder.setProduct("Laptop")
                .setDiscount(0.1)
                .setPaymentMethod("Credit Card")
                .setOrderAddress("439 Cambridge St, 12345")
                .build();

        // Updates the topic state, triggering a response from the observer
        orderSubject.setOrder(order);

        // Create another order
        OrderBuilder orderBuilder1 = new ConcreteOrderBuilder();
        Order anotherOrder = orderBuilder1.setProduct("Iphone 20 pro max plus ultra XS")
                .setDiscount(0.2)
                .setPaymentMethod("PayPal")
                .setOrderPhoneNumber("312-000-0000")
                .build();

        // Updates the topic state, triggering a response from the observer
        orderSubject.setOrder(anotherOrder);

    }
}
