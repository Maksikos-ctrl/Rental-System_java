package VehicleFilters;

import java.util.ArrayList;
import java.util.List;

import Vehicle.Vehicle;

public class VehicleFilters {

    /**
     * Filters a list of vehicles by brand.
     * 
     * @param vehicles the list of vehicles to filter
     * @param brand the brand to filter by
     * @return a list of vehicles that match the specified brand
     */
    public List<Vehicle> filteredByBrand(List<Vehicle> vehicles, String brand) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBrand().equals(brand)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on the specified model.
     * 
     * @param vehicles The list of vehicles to filter.
     * @param model The model to filter by.
     * @return A list of vehicles that match the specified model.
     */
    public List<Vehicle> filteredByModel(List<Vehicle> vehicles, String model) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equals(model)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on the specified year.
     *
     * @param vehicles the list of vehicles to filter
     * @param year the year to filter by
     * @return a list of vehicles that match the specified year
     */
    public List<Vehicle> filteredByYear(List<Vehicle> vehicles, int year) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear() == year) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on the specified hourly rental cost.
     *
     * @param vehicles          the list of vehicles to filter
     * @param hourlyRentalCost  the hourly rental cost to filter by
     * @return                  a list of vehicles that have the specified hourly rental cost
     */
    public List<Vehicle> filteredByHourlyRentalCost(List<Vehicle> vehicles, double hourlyRentalCost) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getHourlyRentalCost() == hourlyRentalCost) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on the daily rental cost.
     *
     * @param vehicles         the list of vehicles to filter
     * @param dailyRentalCost  the daily rental cost to filter by
     * @return                 a list of vehicles that have the specified daily rental cost
     */
    public List<Vehicle> filteredByDailyRentalCost(List<Vehicle> vehicles, double dailyRentalCost) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getDailyRentalCost() == dailyRentalCost) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on the maximum speed.
     *
     * @param vehicles   the list of vehicles to filter
     * @param maxSpeed   the maximum speed to filter by
     * @return           a list of vehicles that have the specified maximum speed
     */
    public List<Vehicle> filteredByMaxSpeed(List<Vehicle> vehicles, int maxSpeed) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMaxSpeed() == maxSpeed) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on their color.
     * 
     * @param vehicles The list of vehicles to filter.
     * @param color The color to filter by.
     * @return A list of vehicles that match the specified color.
     */
    public List<Vehicle> filteredByColor(List<Vehicle> vehicles, String color) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equals(color)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }


    /**
     * Filters a list of vehicles based on the specified battery capacity.
     *
     * @param vehicles The list of vehicles to be filtered.
     * @param batteryCapacity The battery capacity to filter by.
     * @return A list of vehicles that have the specified battery capacity.
     */
    public List<Vehicle> filteredByBatteryCapacity(List<Vehicle> vehicles, int batteryCapacity) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBatteryCapacity() == batteryCapacity) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on their fuel level.
     *
     * @param vehicles   the list of vehicles to filter
     * @param fuelLevel  the desired fuel level to filter by
     * @return           a list of vehicles with the specified fuel level
     */
    public List<Vehicle> filteredByFuelLevel(List<Vehicle> vehicles, double fuelLevel) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getFuelLevel() == fuelLevel) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on the type of brza.
     *
     * @param vehicles    the list of vehicles to filter
     * @param typeOfBrza  the type of brza to filter by
     * @return            a list of vehicles that match the specified type of brza
     */
    public List<Vehicle> filteredByTypeOfBrza(List<Vehicle> vehicles, String typeOfBrza) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfBrza().equals(typeOfBrza)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on whether they have storage or not.
     * 
     * @param vehicles    the list of vehicles to filter
     * @param hasStorage  true to filter vehicles with storage, false to filter vehicles without storage
     * @return            a new list of vehicles that match the filter criteria
     */
    public List<Vehicle> filteredByHasStorage(List<Vehicle> vehicles, boolean hasStorage) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isHasStorage() == hasStorage) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on whether they are foldable or not.
     *
     * @param vehicles   the list of vehicles to filter
     * @param isFoldable the flag indicating whether the vehicles should be foldable or not
     * @return a new list of vehicles that match the specified foldability criteria
     */
    public List<Vehicle> filteredByIsFoldable(List<Vehicle> vehicles, boolean isFoldable) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isFoldable() == isFoldable) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on their battery usage.
     *
     * @param vehicles     the list of vehicles to filter
     * @param batteryUsage the desired battery usage to filter by
     * @return a list of vehicles that have the specified battery usage
     */
    public List<Vehicle> filteredByBatteryUsage(List<Vehicle> vehicles, int batteryUsage) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBatteryUsage() == batteryUsage) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on their battery consumption.
     * 
     * @param vehicles           the list of vehicles to filter
     * @param batteryConsumption the desired battery consumption value
     * @return a list of vehicles that have the specified battery consumption
     */
    public List<Vehicle> filteredByBatteryConsumption(List<Vehicle> vehicles, int batteryConsumption) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBatteryConsumption() == batteryConsumption) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles based on whether they have autopilot or not.
     *
     * @param vehicles     the list of vehicles to be filtered
     * @param hasAutopilot the flag indicating whether the vehicles should have autopilot or not
     * @return a new list of vehicles that satisfy the autopilot condition
     */
    public List<Vehicle> filteredByHasAutopilot(List<Vehicle> vehicles, boolean hasAutopilot) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isHasAutopilot() == hasAutopilot) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    /**
     * Filters a list of vehicles by brand.
     *
     * @param availableVehicles The list of available vehicles to filter.
     * @param brandToFilter The brand to filter by.
     * @return A list of vehicles that match the specified brand.
     */
    public List<Vehicle> filterByBrand(List<Vehicle> availableVehicles, String brandToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getBrand().equals(brandToFilter)) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
     
    }

    /**
     * Filters a list of available vehicles based on the specified model.
     *
     * @param availableVehicles The list of available vehicles to filter.
     * @param modelToFilter The model to filter the vehicles by.
     * @return A list of vehicles that match the specified model.
     */
    public List<Vehicle> filterByModel(List<Vehicle> availableVehicles, String modelToFilter) {
           
            List<Vehicle> filteredVehicles = new ArrayList<>();
    
            for (Vehicle vehicle : availableVehicles) {
                if (vehicle.getModel().equals(modelToFilter)) {
                    filteredVehicles.add(vehicle);
                }
            }
    
            return filteredVehicles;
    }

    /**
     * Filters a list of vehicles by the specified year.
     *
     * @param availableVehicles The list of available vehicles to filter.
     * @param yearToFilter The year to filter the vehicles by.
     * @return A list of vehicles that match the specified year.
     */
    public List<Vehicle> filterByYear(List<Vehicle> availableVehicles, int yearToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getYear() == yearToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
        
    }

    /**
     * Filters the list of available vehicles based on the specified hourly rental cost.
     *
     * @param availableVehicles the list of available vehicles to filter
     * @param hourlyRentalCostToFilter the hourly rental cost to filter by
     * @return a list of vehicles that have the specified hourly rental cost
     */
    public List<Vehicle> filterByHourlyRentalCost(List<Vehicle> availableVehicles, double hourlyRentalCostToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getHourlyRentalCost() == hourlyRentalCostToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
        
    }

    /**
     * Filters the list of available vehicles based on the specified daily rental cost.
     *
     * @param availableVehicles The list of available vehicles to filter.
     * @param dailyRentalCostToFilter The daily rental cost to filter by.
     * @return The filtered list of vehicles.
     */
    public List<Vehicle> filterByDailyRentalCost(List<Vehicle> availableVehicles, double dailyRentalCostToFilter) {
            
        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getDailyRentalCost() == dailyRentalCostToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
 
    }

    /**
     * Filters a list of vehicles based on the specified fuel level.
     *
     * @param availableVehicles The list of available vehicles to filter.
     * @param fuelLevelToFilter The fuel level to filter by.
     * @return A list of vehicles that have the specified fuel level.
     */
    public List<Vehicle> filterByFuelLevel(List<Vehicle> availableVehicles, double fuelLevelToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getFuelLevel() == fuelLevelToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
        
    }

    /**
     * Filters a list of vehicles based on their battery level.
     *
     * @param availableVehicles The list of available vehicles to filter.
     * @param batteryLevelToFilter The battery level to filter by.
     * @return A list of vehicles that match the specified battery level.
     */
    public List<Vehicle> filterByBatteryLevel(List<Vehicle> availableVehicles, double batteryLevelToFilter) {

        List<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getBatteryLevel() == batteryLevelToFilter) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
       
    }

    /**
     * Filters a list of vehicles based on battery consumption.
     * 
     * @param availableVehicles The list of available vehicles to filter.
     * @param batteryConsumptionToFilter The battery consumption value to filter by.
     * @return A list of vehicles that match the specified battery consumption.
     */
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
