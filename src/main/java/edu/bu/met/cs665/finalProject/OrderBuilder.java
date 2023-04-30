package edu.bu.met.cs665.finalProject;
/**
 * @Name: Yiming Hu
 * @Date: Apr 27 2023
 * @Assaginment: Final project
 * @Description: This interface help us to create method to set the parameter in the Order class.
 * */
public interface OrderBuilder {
    OrderBuilder setProduct(String product);

    OrderBuilder setDiscount(double discount);

    OrderBuilder setPaymentMethod(String paymentMethod);

    OrderBuilder setOrderAddress(String Address);
    OrderBuilder setOrderPhoneNumber(String phoneNumber);
    Order build();
}
