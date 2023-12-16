package Customer;

import java.io.Serializable;

import Vehicle.Vehicle;

/* 
 * 
 * 
 * Customer – Zákazník by mal mať atribúty ako name, rentVehicle (inštancia alebo pole
Vehicle) a pod.

 */

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L; // toto je tu len preto, aby som sa zbavil warningu
    
    private String name;
    private Vehicle rentVehicle;
    private double budget;

    public Customer(String name, double budget, Vehicle rentVehicle) {
        this.name = name;
        this.rentVehicle = rentVehicle;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public Vehicle getRentVehicle() {
        return rentVehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRentVehicle(Vehicle rentVehicle) {
        this.rentVehicle = rentVehicle;
    }

    public void updateBudget(double amount) {
        budget += amount;
    }

    public void displayInfo() {
        System.out.println("Customer: " + getName() + " " + getRentVehicle() + " " + getBudget());
    }


    
}
