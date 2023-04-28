package edu.bu.met.cs665.finalProject;

public interface OrderBuilder {
    OrderBuilder setProduct(String product);

    OrderBuilder setDiscount(double discount);

    OrderBuilder setPaymentMethod(String paymentMethod);

    OrderBuilder setOrderAddress(String Address);
    OrderBuilder setOrderPhoneNumber(String phoneNumber);
    Order build();
}
