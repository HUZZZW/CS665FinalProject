package edu.bu.met.cs665.finalProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
public class ClintTest {
    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void ConcreteOrderObserverTest() {
        OrderObserver Seller = new ConcreteOrderObserver("Seller");
        Assert.assertNotNull(Seller);
    }
    @Test
    public void ConcreteOrderSubjectTest(){
        ConcreteOrderSubject orderSubject = new ConcreteOrderSubject();
        Assert.assertNotNull(orderSubject);
    }
    @Test
    public void OrderBuilderTest(){
        OrderBuilder orderBuilder = new ConcreteOrderBuilder();
        Assert.assertNotNull(orderBuilder);
    }
    @Test
    public void ConcreteOrderSubjectTest1(){
        OrderBuilder orderBuilder = new ConcreteOrderBuilder();
        Order order = orderBuilder.setProduct("Laptop")
                .setDiscount(0.1)
                .setPaymentMethod("Credit Card")
                .build();

        assertNotNull(order);
        assertEquals("Laptop", order.getProduct());
        //assertEquals(0.1, order.getDiscount());
        assertEquals("Credit Card", order.getPaymentMethod());

    }
    @Test
    public void AddObserverTest(){
        OrderObserver inventorySystem = new ConcreteOrderObserver("Inventory System");
        OrderObserver financeSystem = new ConcreteOrderObserver("Finance System");

        ConcreteOrderSubject orderSubject = new ConcreteOrderSubject();
        orderSubject.addObserver(inventorySystem);
        orderSubject.addObserver(financeSystem);

        assertEquals(2, orderSubject.observers.size());
        assertTrue(orderSubject.observers.contains(inventorySystem));
        assertTrue(orderSubject.observers.contains(financeSystem));
    }


}