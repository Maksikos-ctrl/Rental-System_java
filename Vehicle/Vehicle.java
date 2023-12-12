package Vehicle;

import java.io.Serializable;

/* 
 * 
 * 
 * 
    Vehicle - Vytvorte abstraktnú triedu s názvom Vehicle s atribútmi ako značka, model,
    rok a cena za hodinu/deň prenájmu. Implementujte metódy getter a setter pre tieto
    atribúty. Zadefinujte abstraktnú metódy calculateShorRentalCost(int hours),
    calculateRentalCost(int days), ktorá vypočíta cenu prenájmu na základe počtu
    hodín/dní.

 * 
 * 
 */

public abstract class Vehicle implements Serializable {
    private String brand;
    private String model;
    private int year;
    private double hourlyRentalCost;
    private double dailyRentalCost;
    
    public Vehicle(String brand, String model, int year, double hourlyRentalCost, double dailyRentalCost) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hourlyRentalCost = hourlyRentalCost;
        this.dailyRentalCost = dailyRentalCost;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Hourly rental cost: " + hourlyRentalCost);
        System.out.println("Daily rental cost: " + dailyRentalCost);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public double getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model= model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHourlyRentalCost(double hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public void setDailyRentalCost(double dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public abstract double calculateShortRentalCost(int hours);
    public abstract double calculateRentalCost(int days);

    public boolean isHasAutopilot() {

        if (isHasAutopilot() == true) {
            return true;
        } else {
            return false;
        }
        
    }

    public int getBatteryConsumption() {

        if (getBatteryConsumption() > 0) {
            return getBatteryConsumption();
        } else {
            return 0;
        }
       
    }

    public int getBatteryUsage() {

        if (getBatteryUsage() > 0) {
            return getBatteryUsage();
        } else {
            return 0;
        }
        
    }

    public boolean isFoldable() {

        if (isFoldable() == true) {
            return true;
        } else {
            return false;
        }
       
    }

    public boolean isHasStorage() {

        if (isHasStorage() == true) {
            return true;
        } else {
            return false;
        }
        
    }

    public Object getTypeOfBrza() {

        if (getTypeOfBrza() == "Disk") {
            return "Disk";
        } else if (getTypeOfBrza() == "VBrza") {
            return "VBrza";
        } else {
            return "NoBrza";
        }
       
    }

    public double getFuelLevel() {

        if (getFuelLevel() > 0) {
            return getFuelLevel();
        } else {
            return 0;
        }
       
    }

    public int getBatteryCapacity() {
        
        if (getBatteryCapacity() > 0) {
            return getBatteryCapacity();
        } else {
            return 0;
        }
       
    }

    public Object getColor() {

        if (getColor() == "Red") {
            return "Red";
        } else if (getColor() == "Blue") {
            return "Blue";
        } else if (getColor() == "Green") {
            return "Green";
        } else if (getColor() == "Yellow") {
            return "Yellow";
        } else if (getColor() == "Black") {
            return "Black";
        } else if (getColor() == "White") {
            return "White";
        } else {
            return "NoColor";
        }
       
    }

    public int getMaxSpeed() {

        if (getMaxSpeed() > 0) {
            return getMaxSpeed();
        } else {
            return 0;
        }


       
    }

    public double getBatteryLevel() {

        if (getBatteryLevel() > 0) {
            return getBatteryLevel();
        } else {
            return 0;
        }
      
    }


    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", dailyRentalCost=" + dailyRentalCost + ", hourlyRentalCost="
                + hourlyRentalCost + ", model=" + model + ", year=" + year + "]";
    }

    


    
   
    
    
}