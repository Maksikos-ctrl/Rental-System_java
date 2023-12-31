package Scooters;

import java.io.Serializable;

import Vehicle.Vehicle;

public class EScooter extends Vehicle implements ElectricVehicle, Serializable {
    private int batteryCapacity;
    private int maxSpeed;
    private String color;
    private boolean isFoldable;


    /**
     * Constructs a new EScooter object with the specified properties.
     *
     * @param brand             the brand of the scooter
     * @param model             the model of the scooter
     * @param year              the year of manufacture
     * @param hourlyRentalCost  the hourly rental cost of the scooter
     * @param dailyRentalCost   the daily rental cost of the scooter
     * @param batteryCapacity   the battery capacity of the scooter
     * @param maxSpeed          the maximum speed of the scooter
     * @param color             the color of the scooter
     * @param isFoldable        indicates if the scooter is foldable
     */

    public EScooter(String brand, String model, int year, double hourlyRentalCost, double dailyRentalCost, int batteryCapacity, int maxSpeed, String color, boolean isFoldable) {
        super(brand, model, year, hourlyRentalCost, dailyRentalCost);
        this.batteryCapacity = batteryCapacity;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.isFoldable = isFoldable;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public boolean isFoldable() {
        return isFoldable;
    }
   
   

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFoldable(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("EScooter: " + getBrand() + " " + getModel() + " " + getYear() + " " + getBatteryCapacity() + " " + getMaxSpeed() + " " + getColor() + " " + isFoldable());
    }

    @Override
    public int getBatteryPercentage() {

        return batteryCapacity;
        
    }
       

    @Override
    public void charge(int batteryPercentage) {
        if (batteryPercentage > 100) {
            System.out.println("Cannot charge battery above 100%");
            return;
        }

        batteryCapacity = Math.min(batteryCapacity + batteryPercentage, 100);
    }

    @Override
    public double calculateShortRentalCost(int hours) {
        double hourlyRate = getHourlyRentalCost();

        if (batteryCapacity < 75) {
            hourlyRate += 5; // Additional charge for low battery level
        }

        return hourlyRate * hours;
    }

    @Override
    public double calculateRentalCost(int days) {
        double dailyRate = getDailyRentalCost();

        if (batteryCapacity < 75) {
            dailyRate += 5;
        }

        return dailyRate * days;
       
    }
    
}
