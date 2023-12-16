package Bikes;

import java.io.Serializable;

import Vehicle.Vehicle;


/**
 * Represents a Bike object.
 * Inherits from the Vehicle class.
 */
public class Bike extends Vehicle implements FuelVehicle, Serializable {

    private String bikeType;
    private double fuelLevel;

 

 
     /**
         * Constructs a Bike object with the specified parameters.
         * 
         * @param brand the brand of the bike
         * @param model the model of the bike
         * @param year the year of the bike
         * @param hourlyRentalCost the hourly rental cost of the bike
         * @param dailyRentalCost the daily rental cost of the bike
         * @param bikeType the type of the bike
         * @param fuelLevel the fuel level of the bike
         */
    public Bike(String brand, String model, int year, double hourlyRentalCost, double dailyRentalCost, String bikeType, int fuelLevel) {
        super(brand, model, year, hourlyRentalCost, dailyRentalCost);
        this.bikeType = bikeType;
        this.fuelLevel = 100;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }



    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Hourly rental cost: " + getHourlyRentalCost());
        System.out.println("Daily rental cost: " + getDailyRentalCost());
        System.out.println("Bike type(Moutain or Road or Hybrid): " + getBikeType());
        
    }

    @Override
    public double getFuelLevel() {

        return fuelLevel;
    
    } 


    
    /**
     * Refuels the bike with the specified fuel level.
     * 
     * @param fuelLevel the fuel level to be added to the bike
     */
    @Override
    public void refuel(double fuelLevel) {

        if (fuelLevel > 100) {
            System.out.println("Cannot charge battery above 100%");
            return;
        }

        this.fuelLevel = Math.min(this.fuelLevel + fuelLevel, 100);

       
       
    }

    /**
     * Calculates the cost of a short-term rental for the bike.
     * The cost is calculated based on the bike type and the number of hours rented.
     *
     * @param hours the number of hours the bike is rented for
     * @return the cost of the short-term rental
     */
    @Override
    public double calculateShortRentalCost(int hours) {

       double hourlyRate = 0; // hourly rate of the bike is how much it costs to rent the bike per hour

        if (getBikeType().equals("Mountain")) {
            hourlyRate = getHourlyRentalCost() + 5; // 5 is the cost of the helmet
        } else if (getBikeType().equals("Road")) {
            hourlyRate = getHourlyRentalCost() + 2.5; // 2.5 is the cost of the helmet
        } else if (getBikeType().equals("Hybrid")) {
            hourlyRate = getHourlyRentalCost() + 7.5; // 7.5 is the cost of the helmet
        } else {
            return 0;
        }

        return hours * hourlyRate;
        
    }

    /**
     * Calculates the rental cost for the bike based on the number of days.
     * The rental cost includes the daily rental cost of the bike and additional costs for the helmet.
     * 
     * @param days The number of days for which the bike is rented.
     * @return The total rental cost for the bike.
     */
    @Override
    public double calculateRentalCost(int days) {

        double dailyRate = 0;

        if (getBikeType().equals("Mountain")) {
            dailyRate = getDailyRentalCost() + 5; // 5 is the cost of the helmet
        } else if (getBikeType().equals("Road")) {
            dailyRate = getDailyRentalCost() + 2.5; // 2.5 is the cost of the helmet
        } else if (getBikeType().equals("Hybrid")) {
            dailyRate = getDailyRentalCost() + 7.5; // 7.5 is the cost of the helmet
        } else {
            return 0;
        }

        return days * dailyRate;

        
       
    }


     



}