package edu.bu.met.cs665.finalProject;

import java.util.List;
import java.util.ArrayList;
public class ConcreteOrderSubject implements OrderSubject {
    public List<OrderObserver> observers = new ArrayList<>();
    private Order order;
    public void setOrder(Order order){
        this.order = order;
        notifyObserver();
    }

    @Override
    public void addObserver(OrderObserver observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(OrderObserver observer : observers){
            observer.update(order);
        }
    }
}
