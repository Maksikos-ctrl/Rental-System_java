package Bikes;
interface ElectricVehicle {
    /**
    * Get the remaining battery percentage of the electric vehicle.
    *
    * @return The remaining battery percentage.
    */
    int getBatteryPercentage();
    /**
    * Charge the electric vehicle to the specified battery percentage.
    *
    * @param batteryPercentage The target battery percentage to charge to.
    */
    void charge(int batteryPercentage);
    
    
}
