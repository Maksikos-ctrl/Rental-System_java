package Cars;


import Vehicle.Vehicle;


public class Car extends Vehicle implements FuelVehicle {
 
    private int numDoors;
    private int numberOfSeats;
    private String fuelType;
    private double fuelTankCapacity;
    private boolean isConvertible; 



    public Car(String brand, String model, int year, double hourlyRentalCost, double dailyRentalCost, int numDoors, int numberOfSeats, String fuelType, double fuelTankCapacity, boolean isConvertible) {
        super(brand, model, year, hourlyRentalCost, dailyRentalCost);
        this.numDoors = numDoors;
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
        this.fuelTankCapacity = 100;
        this.isConvertible = isConvertible;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

   
    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car: " + getBrand() + " " + getModel() + " " + getYear() + " " + getNumDoors() + " " + getNumberOfSeats() + " " + getFuelType() + " " + getFuelTankCapacity() + " " + isConvertible()); 
    }


   
    
    

    @Override
    public double calculateShortRentalCost(int hours) {

        double hourlyRate = getHourlyRentalCost();

        if (isConvertible || numberOfSeats > 5 || numDoors > 4 || fuelTankCapacity > 50 || fuelType == "Diesel") {
            hourlyRate += 5; 
        } else if (fuelType == "Gas") {
            hourlyRate += 3;
        }

        return hourlyRate * hours;
      
        
    }

    @Override
    public double calculateRentalCost(int days) {
        double dailyRate = 0;

        if (isConvertible || numberOfSeats > 5 || numDoors > 4 || fuelTankCapacity > 50 || fuelType == "Diesel") {
            dailyRate = getDailyRentalCost() + 5; 
        } else if (fuelType == "Gas") {
            dailyRate = getDailyRentalCost() + 3;
        }

        return dailyRate * days;

        
    }  

    @Override
    public double getFuelLevel() {

        return fuelTankCapacity;
       
    }

    @Override
    public void refuel(double fuelLevel) {

        if (fuelLevel > 100) {
            System.out.println("Cannot charge battery above 100%");
            return;
        }

        this.fuelTankCapacity = Math.min(this.fuelTankCapacity + fuelLevel, 100);
        
    }

}