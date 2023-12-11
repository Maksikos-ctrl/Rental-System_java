package VehicleFilters;

import java.util.ArrayList;
import java.util.List;

import Vehicle.Vehicle;

public class VehicleFilters {

    public List<Vehicle> filteredByBrand(List<Vehicle> vehicles, String brand) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBrand().equals(brand)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByModel(List<Vehicle> vehicles, String model) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equals(model)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByYear(List<Vehicle> vehicles, int year) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear() == year) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByHourlyRentalCost(List<Vehicle> vehicles, double hourlyRentalCost) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getHourlyRentalCost() == hourlyRentalCost) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByDailyRentalCost(List<Vehicle> vehicles, double dailyRentalCost) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getDailyRentalCost() == dailyRentalCost) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByMaxSpeed(List<Vehicle> vehicles, int maxSpeed) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMaxSpeed() == maxSpeed) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByColor(List<Vehicle> vehicles, String color) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equals(color)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }


    public List<Vehicle> filteredByBatteryCapacity(List<Vehicle> vehicles, int batteryCapacity) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBatteryCapacity() == batteryCapacity) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByFuelLevel(List<Vehicle> vehicles, double fuelLevel) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getFuelLevel() == fuelLevel) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByTypeOfBrza(List<Vehicle> vehicles, String typeOfBrza) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfBrza().equals(typeOfBrza)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByHasStorage(List<Vehicle> vehicles, boolean hasStorage) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isHasStorage() == hasStorage) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByIsFoldable(List<Vehicle> vehicles, boolean isFoldable) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isFoldable() == isFoldable) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByBatteryUsage(List<Vehicle> vehicles, int batteryUsage) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBatteryUsage() == batteryUsage) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByBatteryConsumption(List<Vehicle> vehicles, int batteryConsumption) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBatteryConsumption() == batteryConsumption) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filteredByHasAutopilot(List<Vehicle> vehicles, boolean hasAutopilot) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isHasAutopilot() == hasAutopilot) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> filterByBrand(List<Vehicle> availableVehicles, String brandToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getBrand().equals(brandToFilter)) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
     
    }

    public List<Vehicle> filterByModel(List<Vehicle> availableVehicles, String modelToFilter) {
           
            List<Vehicle> filteredVehicles = new ArrayList<>();
    
            for (Vehicle vehicle : availableVehicles) {
                if (vehicle.getModel().equals(modelToFilter)) {
                    filteredVehicles.add(vehicle);
                }
            }
    
            return filteredVehicles;
    }

    public List<Vehicle> filterByYear(List<Vehicle> availableVehicles, int yearToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getYear() == yearToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
        
    }

    public List<Vehicle> filterByHourlyRentalCost(List<Vehicle> availableVehicles, double hourlyRentalCostToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getHourlyRentalCost() == hourlyRentalCostToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
        
    }

    public List<Vehicle> filterByDailyRentalCost(List<Vehicle> availableVehicles, double dailyRentalCostToFilter) {
            
        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getDailyRentalCost() == dailyRentalCostToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
 
    }

    public List<Vehicle> filterByFuelLevel(List<Vehicle> availableVehicles, double fuelLevelToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getFuelLevel() == fuelLevelToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
        
    }

    public List<Vehicle> filterByBatteryLevel(List<Vehicle> availableVehicles, double batteryLevelToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getBatteryLevel() == batteryLevelToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
       
    }

    public List<Vehicle> filterByBatteryConsumption(List<Vehicle> availableVehicles, double batteryConsumptionToFilter) {
           
        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getBatteryConsumption() == batteryConsumptionToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
    }
    





    
}
