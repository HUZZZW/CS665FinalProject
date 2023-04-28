package edu.bu.met.cs665.finalProject;


public interface OrderSubject {
    void addObserver(OrderObserver observer);
    void removeObserver(OrderObserver observer);
    void notifyObserver();

}
