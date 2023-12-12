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


public class RentalSystem implements Serializable {

    private String name;
    private List<Vehicle> availableVehicles;
    private List<Vehicle> rentedVehicles;
    private List<Customer> customers;
    private double finances;


    
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
    
   
    public void rentVehicle(Vehicle vehicle) {
        if (availableVehicles.contains(vehicle)) {
            availableVehicles.remove(vehicle);
            rentedVehicles.add(vehicle);
          
            double rentalCost = calculateRentalCost(vehicle, 1);
            updateFinances(-rentalCost);
        }
    }
    
    
    public void returnVehicle(Vehicle vehicle) {
        if(rentedVehicles.contains(vehicle)) {
            rentedVehicles.remove(vehicle);
            availableVehicles.add(vehicle);
        }
    }
    
    
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


    public void copyData(RentalSystem other) {
        this.availableVehicles = other.availableVehicles;
        this.rentedVehicles = other.rentedVehicles;
        this.customers = other.customers;
        this.finances = other.finances;
    }
   
}