package Scooters;

import Vehicle.Vehicle;

public class Scooter extends Vehicle implements FuelVehicle {

    private double fuelLevel;
    private int maxSpeed;
    private String typeOfBrza;
    private boolean hasStorage;

    public Scooter(String brand, String model, int year, double hourlyRentalCost, double dailyRentalCost, int fuelLevel, int maxSpeed, String typeOfBrza, boolean hasStorage) {
        super(brand, model, year, hourlyRentalCost, dailyRentalCost);
        this.fuelLevel = fuelLevel;
        this.maxSpeed = maxSpeed;
        this.typeOfBrza = typeOfBrza;
        this.hasStorage = hasStorage;
    }


    public double getFuelLevel() {
        return fuelLevel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public String getTypeOfBrza() {
        return typeOfBrza;
    }

    public boolean isHasStorage() {
        return hasStorage;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public void setTypeOfBrza(String typeOfBrza) {
        this.typeOfBrza = typeOfBrza;
    }

    public void setHasStorage(boolean hasStorage) {
        this.hasStorage = hasStorage;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Scooter: " + getBrand() + " " + getModel() + " " + getYear() + " " + getFuelLevel() + " " + getMaxSpeed() + " " + getTypeOfBrza() + " " + isHasStorage());
    }

    @Override
    public void refuel(double fuelLevel) {

        if (fuelLevel > 100) {
            System.out.println("Cannot refuel above 100%");
            return;
        }

        this.fuelLevel = Math.min(this.fuelLevel + fuelLevel, 100);
       
    }


    @Override
    public double calculateShortRentalCost(int hours) {

        double hourlyRate = getHourlyRentalCost();

        if (fuelLevel < 75 || maxSpeed > 50 || typeOfBrza == "Disk" || hasStorage == true) {
            hourlyRate += 5; 
        } else if (typeOfBrza == "VBrza") {
            hourlyRate += 3;
        }

        return hourlyRate * hours;
        
    }


    @Override
    public double calculateRentalCost(int days) {

        double dailyRate = 0;

        if (fuelLevel < 75 || maxSpeed > 50 || typeOfBrza == "Disk" || hasStorage == true) {
            dailyRate = getDailyRentalCost() + 5; 
        } else if (typeOfBrza == "VBrza") {
            dailyRate = getDailyRentalCost() + 3;
        }

        return dailyRate * days;
        
    }

    

    
}
