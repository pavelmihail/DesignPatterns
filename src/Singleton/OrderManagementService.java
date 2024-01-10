package Singleton;
/*
    Singleton ensure that the class has one instance and provide a global
    point of access to it
 */
public class OrderManagementService {

    // Define static field in the singleton class
    private static OrderManagementService instance;

    // Make the constructor private
    private OrderManagementService() {
    }

    // Implement public access function
    // Make the function lazy - it is initialized only when it is used
    // Make the function synchronized in case it is used in multithreading
    public static synchronized OrderManagementService getInstance() {
        if (instance == null)
            instance = new OrderManagementService();
        return instance;
    }

    public void placeOrderOrSmth(){
        System.out.println("The order was placed");
    }
}
