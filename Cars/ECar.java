package Cars;


import java.io.Serializable;

import Vehicle.Vehicle;


public class ECar extends Vehicle implements ElectricVehicle, Serializable {

    /**
 * Represents an electric car that extends the Vehicle class and implements the ElectricVehicle interface.
 * It contains information about the battery capacity, battery usage, battery consumption, and whether it has autopilot.
 */

    private int batteryCapacity;
    private int batteryUsage;
    private int batteryConsumption;
    private boolean hasAutopilot;



     /**
     * Constructs a new ECar object with the specified properties.
     * 
     * @param brand             the brand of the car
     * @param model             the model of the car
     * @param year              the year of the car
     * @param hourlyRentalCost  the hourly rental cost of the car
     * @param dailyRentalCost   the daily rental cost of the car
     * @param batteryCapacity   the battery capacity of the car
     * @param batteryUsage      the current battery usage of the car
     * @param batteryConsumption   the battery consumption rate of the car
     * @param hasAutopilot      indicates whether the car has autopilot feature
     */
    public ECar(String brand, String model, int year, double hourlyRentalCost, double dailyRentalCost, int batteryCapacity, int batteryUsage, int batteryConsumption, boolean hasAutopilot) {
        super(brand, model, year, hourlyRentalCost, dailyRentalCost);
        this.batteryCapacity = batteryCapacity;
        this.batteryUsage = batteryUsage;
        this.batteryConsumption = batteryConsumption;
        this.hasAutopilot = hasAutopilot;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getBatteryUsage() {
        return batteryUsage;
    }

    public int getBatteryConsumption() {
        return batteryConsumption;
    }


    public boolean isHasAutopilot() {
        return hasAutopilot;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setBatteryUsage(int batteryUsage) {
        this.batteryUsage = batteryUsage;
    }

    public void setBatteryConsumption(int batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

    public void setHasAutopilot(boolean hasAutopilot) {
        this.hasAutopilot = hasAutopilot;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("ECar: " + getBrand() + " " + getModel() + " " + getYear() + " " + getBatteryCapacity() + " " + getBatteryUsage() + " " + getBatteryConsumption() + " " + isHasAutopilot());
    }

    /**
     * Calculates the cost of a short rental for an electric car based on the number of hours.
     * The hourly rate is determined by the battery capacity of the car.
     *
     * @param hours the number of hours for the rental
     * @return the cost of the short rental
     */
    @Override
    public double calculateShortRentalCost(int hours) {

        double hourlyRate = 0;

        if (batteryCapacity > 0 && batteryCapacity <= 20) {
            hourlyRate = 0.5; // 0.5 euro per hour
        } else if (batteryCapacity > 20 && batteryCapacity <= 40) {
            hourlyRate = 0.75;
        } else if (batteryCapacity > 40 && batteryCapacity <= 60) {
            hourlyRate = 1;
        } else if (batteryCapacity > 60 && batteryCapacity <= 80) {
            hourlyRate = 1.25;
        } else if (batteryCapacity > 80 && batteryCapacity <= 100) {
            hourlyRate = 1.5;
        }

        return hours * hourlyRate;
        
        
    }

    /**
     * Calculates the rental cost for the electric car based on the number of days.
     * The daily rate is determined by the battery capacity of the car.
     *
     * @param days The number of days for which the car is rented.
     * @return The total rental cost for the specified number of days.
     */
    @Override

    public double calculateRentalCost(int days) {
       
        double dailyRate = 0;

        if (batteryCapacity > 0 && batteryCapacity <= 20) {
            dailyRate = 5; // 0.5 euro per hour
        } else if (batteryCapacity > 20 && batteryCapacity <= 40) {
            dailyRate = 7.5;
        } else if (batteryCapacity > 40 && batteryCapacity <= 60) {
            dailyRate = 10;
        } else if (batteryCapacity > 60 && batteryCapacity <= 80) {
            dailyRate = 12.5;
        } else if (batteryCapacity > 80 && batteryCapacity <= 100) {
            dailyRate = 15;
        }

        return days * dailyRate;
          

    }

    @Override
    public int getBatteryPercentage() {
    
        return batteryUsage;
    
       
    }

    /**
     * Charges the battery of the electric car.
     * 
     * @param batteryPercentage the percentage of battery to charge
     */
    @Override
    public void charge(int batteryPercentage) {

        if (batteryPercentage > 100) {
            System.out.println("Cannot charge battery above 100%");
            return;
        }

        this.batteryUsage = Math.min(this.batteryUsage + batteryPercentage, 100);
        
    }

    
        
   
    
}
