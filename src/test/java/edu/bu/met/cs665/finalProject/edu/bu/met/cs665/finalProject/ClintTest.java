package edu.bu.met.cs665.finalProject;
/**
 * @Name: Yiming Hu
 * @Date: Apr 27 2023
 * @Assaginment: Final project
 * @Description: test function
 * */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
public class ClintTest {
    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void ConcreteOrderObserverTest() {//this test function is for the test if OrderObserver has been created
        OrderObserver Seller = new ConcreteOrderObserver("Seller");
        Assert.assertNotNull(Seller);
    }
    @Test
    public void ConcreteOrderSubjectTest(){ //this test function is for if Subject has been created
        ConcreteOrderSubject orderSubject = new ConcreteOrderSubject();
        Assert.assertNotNull(orderSubject);
    }
    @Test
    public void OrderBuilderTest(){ //this is for test if order has been created
        OrderBuilder orderBuilder = new ConcreteOrderBuilder();
        Assert.assertNotNull(orderBuilder);
    }
    @Test
    public void ConcreteOrderSubjectTest1(){//This is to test whether the entire order is created with the correct input values
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
    public void AddObserverTest(){//This is to prove whether or not an observer is created. See if the chain is correct.
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