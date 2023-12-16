package RentalSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Customer.Customer;
import Vehicle.Vehicle;

/* 
 * 
    * RentalSystem – nazov, pole vozidiel, financie a pod. Implementujte metódy na
    zobrazenie dostupných vozidiel, prenájom vozidla zákazníkovi, vrátenie vozidla,
    zobrazenie histórie prenájmu, prístup k financiam, opravy vozidiel a pod. Zabezpečte
    správnu validáciu na riešenie prípadov, ako je pokus o prenájom nedostupného
    vozidla alebo vrátenie vozidla, ktoré nebolo prenajaté a pod.

 * 
 * 
 * 
 */


/**
 * The RentalSystem class represents a rental system that manages vehicles and customers.
 * It allows adding vehicles to the inventory, renting and returning vehicles, and managing finances.
 */
public class RentalSystem implements Serializable {

    private String name;
    private List<Vehicle> availableVehicles;
    private List<Vehicle> rentedVehicles;
    private List<Customer> customers;
    private double finances;


    
    /**
     * Represents a rental system.
     * This class manages the available vehicles, rented vehicles, customers, and finances of the rental system.
     *
     * @param name the name of the rental system
     */
    public RentalSystem(String name) {
        this.name = name;
        this.availableVehicles = new ArrayList<>();
        this.rentedVehicles = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.finances = 0.0;
    }
    

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }
    
    public List<Vehicle> getAvailableVehicles(){
        return availableVehicles;
    }
    
    public List<Vehicle> getRentedVehicles(){
        return rentedVehicles;
    }
    
   
    /**
     * Rents a vehicle by removing it from the list of available vehicles and adding it to the list of rented vehicles.
     * Also updates the finances by deducting the rental cost.
     * 
     * @param vehicle the vehicle to be rented
     */
    public void rentVehicle(Vehicle vehicle) {
        if (availableVehicles.contains(vehicle)) {
            availableVehicles.remove(vehicle);
            rentedVehicles.add(vehicle);
          
            double rentalCost = calculateRentalCost(vehicle, 1);
            updateFinances(-rentalCost);
        }
    }
    
    
    /**
     * Returns a rented vehicle to the rental system.
     * If the vehicle is currently rented, it will be removed from the list of rented vehicles
     * and added to the list of available vehicles.
     *
     * @param vehicle the vehicle to be returned
     */
    public void returnVehicle(Vehicle vehicle) {
        if(rentedVehicles.contains(vehicle)) {
            rentedVehicles.remove(vehicle);
            availableVehicles.add(vehicle);
        }
    }
    
    
    /**
     * Displays the information of available and rented vehicles in the rental system.
     */
    public void displayRentalInfo() {
        System.out.println("========Available vehicles: ========");
        for(Vehicle av : availableVehicles) {
            av.displayInfo();
            System.out.println();
        }
        
        System.out.println("========Rented vehicles: ========");
        for(Vehicle rv : rentedVehicles) {
            rv.displayInfo();
            System.out.println();
        }
    }
    
    
    /**
     * Calculates the rental cost for a given vehicle and rental duration.
     * If the rental duration is less than 24 hours, it calls the calculateShortRentalCost method of the vehicle.
     * Otherwise, it calls the calculateRentalCost method of the vehicle.
     *
     * @param vehicle The vehicle for which the rental cost is calculated.
     * @param rentalDuration The duration of the rental in hours.
     * @return The total rental cost.
     */
    public double calculateRentalCost(Vehicle vehicle, int rentalDuration) {
        double totalCost = 0;
        if(rentalDuration < 24) {
            totalCost = vehicle.calculateShortRentalCost(rentalDuration);
        } else {
            totalCost = vehicle.calculateRentalCost(rentalDuration);
        }
        return totalCost;
    }

    public double accessToWallet() {
        return finances;
    }

    public void updateFinances(double amount) {
        finances += amount;
    }


    /**
     * Calculates the total finances of the rental system.
     * 
     * @return A string representation of the total finances in the format "Total Finances: €[totalFinances]".
     */
    public String accessToFinances() {

        double totalFinances = 0.0;

        for (Customer customer : customers) {
            totalFinances += customer.getBudget();
        }

        return "Total Finances: €" + totalFinances;
        
    }

    public void addVehicleToInventory(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }


    public List<Customer> getCustomers() {
        return customers;
    }


    /**
     * Copies the data from another RentalSystem object.
     * 
     * @param other the RentalSystem object to copy the data from
     */
    public void copyData(RentalSystem other) {
        this.availableVehicles = other.availableVehicles;
        this.rentedVehicles = other.rentedVehicles;
        this.customers = other.customers;
        this.finances = other.finances;
    }


    public void setAvailableVehicles(List<Vehicle> availableVehicles2) {

        this.availableVehicles = availableVehicles2;
    }
   
}