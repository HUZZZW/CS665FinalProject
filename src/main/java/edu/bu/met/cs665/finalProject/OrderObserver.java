package edu.bu.met.cs665.finalProject;
/**
 * @Name: Yiming Hu
 * @Date: Apr 27 2023
 * @Assaginment: Final project
 * @Description: This interface help us to set the update function. Update function is the way how we notified to each observer.
 * */
import edu.bu.met.cs665.finalProject.Order;

public interface OrderObserver {
    void update(Order order);
}
