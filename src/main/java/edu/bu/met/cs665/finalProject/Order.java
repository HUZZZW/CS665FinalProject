package edu.bu.met.cs665.finalProject;
/**
 * @Name: Yiming Hu
 * @Date: Apr 27 2023
 * @Assaginment: Final project
 * @Description: This class is the place we are define the parameter for the order such as prodectName, Phone Number and so on
 * */
//import com.sun.org.apache.xpath.internal.operations.Or;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.time.LocalTime;

public class Order {
    private String product;
    private String phoneNumber;
    private double discount;
    private String paymentMethod;
    private LocalTime orderTime;
    private String orderAddress;
    public Order(){}
    public Order(String product, double discount, String paymentMethod,String orderAddress,String phoneNumber){
        this.product = product;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
        this.orderAddress = orderAddress;
        this.phoneNumber = phoneNumber;
        orderTime = LocalTime.now();
    }
    public String getProduct() {
        return product;
    }

    public double getDiscount() {
        return discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

