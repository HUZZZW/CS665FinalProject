package edu.bu.met.cs665.finalProject;
/**
 * @Name: Yiming Hu
 * @Date: Apr 27 2023
 * @Assaginment: Final project
 * @Description: This class is to use implement OrderBuilder interface
 * */
public class ConcreteOrderBuilder implements OrderBuilder{
    private String product;
    private double discount;
    private String paymentMethod;
    private String orderAddress;
    private String phoneNumber;

    @Override
    public OrderBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    @Override
    public OrderBuilder setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public OrderBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @Override
    public OrderBuilder setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
        return this;
    }

    @Override
    public OrderBuilder setOrderPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public  Order build(){
        return new Order(product,discount,paymentMethod,orderAddress,phoneNumber);
    }
}
