package Bikes;



import java.io.Serializable;

import Vehicle.Vehicle;


public class EBike extends Vehicle implements ElectricVehicle, Serializable {

   /**
     * Represents an electric bike.
     * 
     * This class extends the Vehicle class and implements the ElectricVehicle interface.
     * It provides functionality to store and retrieve information about an electric bike,
     * such as the maximum speed, color, and battery level.
     */
    private int maxSpeed;
    private String color;
    private int batteryLevel;



    /**
     * Constructs an EBike object with the specified attributes.
     * 
     * @param brand the brand of the electric bike
     * @param model the model of the electric bike
     * @param year the year of the electric bike
     * @param hourlyRentalCost the hourly rental cost of the electric bike
     * @param dailyRentalCost the daily rental cost of the electric bike
     * @param maxSpeed the maximum speed of the electric bike
     * @param color the color of the electric bike
     */
    public EBike(String brand, String model, int year, double hourlyRentalCost, double dailyRentalCost, int maxSpeed, String color) {
        super(brand, model, year, hourlyRentalCost, dailyRentalCost);
        this.batteryLevel = 100;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("EBike: " + getBrand() + " " + getModel() + " " + getYear() + " " + getMaxSpeed() + " " + getColor());
    }


    

    @Override
    public int getBatteryPercentage() {
        return batteryLevel;
    }

    @Override
    public void charge(int batteryPercentage) {
        if (batteryPercentage > 100) {
            System.out.println("Cannot charge battery above 100%");
            return;
        }

        batteryLevel = Math.min(batteryLevel + batteryPercentage, 100);
        System.out.println("Battery charged to " + batteryLevel + "%");
    }



    @Override
    public double calculateShortRentalCost(int hours) {
        double hourlyRate = getHourlyRentalCost();

        if (batteryLevel < 75) {
            hourlyRate += 5; // Additional charge for low battery level
        }

        return hourlyRate * hours;
    }

    @Override
    public double calculateRentalCost(int days) {
        double dailyRate = getDailyRentalCost();

        if (batteryLevel < 50) {
            dailyRate += 10; // Additional charge for critically low battery level
        }

        return dailyRate * days;
    }
    
}
