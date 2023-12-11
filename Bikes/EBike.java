package Bikes;



import Vehicle.Vehicle;

public class EBike extends Vehicle implements ElectricVehicle {

   
    private int maxSpeed;
    private String color;
    private int batteryLevel;


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
