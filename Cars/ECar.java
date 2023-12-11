package Cars;


import Vehicle.Vehicle;

public class ECar extends Vehicle implements ElectricVehicle {

    private int batteryCapacity;
    private int batteryUsage;
    private int batteryConsumption;
    private boolean hasAutopilot;

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

    @Override
    public void charge(int batteryPercentage) {

        if (batteryPercentage > 100) {
            System.out.println("Cannot charge battery above 100%");
            return;
        }

        this.batteryUsage = Math.min(this.batteryUsage + batteryPercentage, 100);
        
    }

    
        
   
    
}
