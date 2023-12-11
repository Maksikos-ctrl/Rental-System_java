package Bikes;

import Vehicle.Vehicle;


public class Bike extends Vehicle implements FuelVehicle {

    private String bikeType;
    private double fuelLevel;


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
        System.out.println("Bike type: " + getBikeType());
        
    }

    @Override
    public double getFuelLevel() {

        return fuelLevel;
    
    }

    @Override
    public void refuel(double fuelLevel) {

        if (fuelLevel > 100) {
            System.out.println("Cannot charge battery above 100%");
            return;
        }

        this.fuelLevel = Math.min(this.fuelLevel + fuelLevel, 100);

       
       
    }

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