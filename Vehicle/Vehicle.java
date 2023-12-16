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

    /**
     * Constructs a new Bike object with the specified parameters.
     *
     * @param brand             The brand of the bike.
     * @param model             The model of the bike.
     * @param year              The manufacturing year of the bike.
     * @param hourlyRentalCost The hourly rental cost of the bike.
     * @param dailyRentalCost  The daily rental cost of the bike.
     * @param bikeType          The type of the bike (Mountain, Road, Hybrid, etc.).
     * @param fuelLevel         The fuel level of the bike.
     */

    
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

    /**
     * Checks if the vehicle has autopilot feature.
     * 
     * @return true if the vehicle has autopilot, false otherwise.
     */
    public boolean isHasAutopilot() {

        if (isHasAutopilot() == true) {
            return true;
        } else {
            return false;
        }
        
    }

    /**
     * Returns the battery consumption of the vehicle.
     * 
     * @return the battery consumption of the vehicle
     */
    public int getBatteryConsumption() {

        if (getBatteryConsumption() > 0) {
            return getBatteryConsumption();
        } else {
            return 0;
        }
       
    }

    /**
     * Returns the battery usage of the vehicle.
     * 
     * @return the battery usage of the vehicle
     */
    public int getBatteryUsage() {

        if (getBatteryUsage() > 0) {
            return getBatteryUsage();
        } else {
            return 0;
        }
        
    }

    /**
     * Checks if the vehicle is foldable.
     * 
     * @return true if the vehicle is foldable, false otherwise.
     */
    public boolean isFoldable() {

        if (isFoldable() == true) {
            return true;
        } else {
            return false;
        }
       
    }

    /**
     * Checks if the vehicle has storage.
     * 
     * @return true if the vehicle has storage, false otherwise.
     */
    public boolean isHasStorage() {

        if (isHasStorage() == true) {
            return true;
        } else {
            return false;
        }
        
    }

    /**
     * Returns the type of "Brza" for the vehicle.
     * 
     * @return the type of "Brza" as an Object. Possible values are "Disk", "VBrza", or "NoBrza".
     */
    public Object getTypeOfBrza() {

        if (getTypeOfBrza() == "Disk") {
            return "Disk";
        } else if (getTypeOfBrza() == "VBrza") {
            return "VBrza";
        } else {
            return "NoBrza";
        }
       
    }

    /**
     * Returns the current fuel level of the vehicle.
     * 
     * @return the fuel level of the vehicle
     */
    public double getFuelLevel() {

        if (getFuelLevel() > 0) {
            return getFuelLevel();
        } else {
            return 0;
        }
       
    }

    /**
     * Returns the battery capacity of the vehicle.
     * 
     * @return the battery capacity of the vehicle, or 0 if the battery capacity is not available.
     */
    public int getBatteryCapacity() {
        
        if (getBatteryCapacity() > 0) {
            return getBatteryCapacity();
        } else {
            return 0;
        }
       
    }

    /**
     * Returns the color of the vehicle.
     * 
     * @return the color of the vehicle as an Object
     */
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

    /**
     * Returns the maximum speed of the vehicle.
     *
     * @return the maximum speed of the vehicle
     */
    public int getMaxSpeed() {

        if (getMaxSpeed() > 0) {
            return getMaxSpeed();
        } else {
            return 0;
        }


       
    }

    /**
     * Returns the battery level of the vehicle.
     * 
     * @return the battery level of the vehicle
     */
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