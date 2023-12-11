
import java.util.Scanner;

import Bikes.Bike;
import Bikes.EBike;
import Cars.Car;
import Cars.ECar;
import Customer.Customer;
import RentalSystem.RentalSystem;
import Scooters.EScooter;
import Vehicle.Vehicle;
import java.util.List;
import VehicleFilters.VehicleFilters;


public class UI {

    private static Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);
    }

   
    public void displayMenu() {
        System.out.println("======== Rental System Menu ========");
        System.out.println("1. Display available vehicles");
        System.out.println("2. Display rented vehicles");
        System.out.println("3. Rent a vehicle");
        System.out.println("4. Return a vehicle");
        System.out.println("5. Add a vehicle");
        System.out.println("6. Add customer");
        System.out.println("7. Display customers and their budgets");
        System.out.println("8. Display rental information");
        System.out.println("9. Access finances");
        System.out.println("10. Filter vehicles by criteria/s");
        System.out.println("11. Save data to file");
        System.out.println("12. Load data from file");
        System.out.println("13. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run(RentalSystem rentalSystem) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    displayVehicles(rentalSystem.getAvailableVehicles(), "Available Vehicles");
                    break;
                case 2:
                    displayVehicles(rentalSystem.getRentedVehicles(), "Rented Vehicles");
                    break;
                case 3:
                    rentVehicle(rentalSystem);
                    break;
                case 4:
                    returnVehicle(rentalSystem);
                    break;
                case 5:
                    addVehicle(rentalSystem);
                    break;
                case 6:
                    addCustomer(rentalSystem);
                    break;
                case 7:
                    displayCustomers(rentalSystem.getCustomers());
                    break;
                case 8:
                    rentalSystem.displayRentalInfo();
                    break;
                case 9:
                    displayFinances(rentalSystem);
                    break;
                case 10:
                    filterVehicles(rentalSystem);
                    break;
                case 11:
                    saveDataToFile();
                    break;
                case 12:
                    loadDataFromFile();
                    break;
                case 13:
                    System.out.println("Exiting the Rental System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 13);
    }

    
    private void filterVehicles(RentalSystem rentalSystem) {
        VehicleFilters vehicleFiltering = new VehicleFilters();

        System.out.println("======== Filter Vehicles ========");
        System.out.println("1. Filter by brand");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by year");
        System.out.println("4. Filter by hourly rental cost");
        System.out.println("5. Filter by daily rental cost");
        System.out.println("6. Filter by fuel level");
        System.out.println("7. Filter by battery level");
        System.out.println("8. Filter by battery consumption");
        System.out.println("9. Filter by battery usage");
        System.out.print("Enter your choice: ");
        int filterChoice = scanner.nextInt();
        scanner.nextLine();

        switch (filterChoice) {
            case 1:
                System.out.print("Enter brand to filter: ");
                String brandToFilter = scanner.nextLine();
                List<Vehicle> filteredByBrand = vehicleFiltering.filterByBrand(rentalSystem.getAvailableVehicles(), brandToFilter);
                displayVehicles(filteredByBrand, "Filtered Vehicles");
                break;
            case 2:
                System.out.print("Enter model to filter: ");
                String modelToFilter = scanner.nextLine();
                List<Vehicle> filteredByModel = vehicleFiltering.filterByModel(rentalSystem.getAvailableVehicles(), modelToFilter);
                displayVehicles(filteredByModel, "Filtered Vehicles");
                break;
            case 3:
                System.out.print("Enter year to filter: ");
                int yearToFilter = scanner.nextInt();
                scanner.nextLine();
                List<Vehicle> filteredByYear = vehicleFiltering.filterByYear(rentalSystem.getAvailableVehicles(), yearToFilter);
                displayVehicles(filteredByYear, "Filtered Vehicles");
                break;
            case 4:
                System.out.print("Enter hourly rental cost to filter: ");
                double hourlyRentalCostToFilter = scanner.nextDouble();
                scanner.nextLine();
                List<Vehicle> filteredByHourlyRentalCost = vehicleFiltering.filterByHourlyRentalCost(rentalSystem.getAvailableVehicles(), hourlyRentalCostToFilter);
                displayVehicles(filteredByHourlyRentalCost, "Filtered Vehicles");
                break;
            case 5:
                System.out.print("Enter daily rental cost to filter: ");
                double dailyRentalCostToFilter = scanner.nextDouble();
                scanner.nextLine();
                List<Vehicle> filteredByDailyRentalCost = vehicleFiltering.filterByDailyRentalCost(rentalSystem.getAvailableVehicles(), dailyRentalCostToFilter);
                displayVehicles(filteredByDailyRentalCost, "Filtered Vehicles");
                break;
            case 6:
                System.out.print("Enter fuel level to filter: ");
                double fuelLevelToFilter = scanner.nextDouble();
                scanner.nextLine();
                List<Vehicle> filteredByFuelLevel = vehicleFiltering.filterByFuelLevel(rentalSystem.getAvailableVehicles(), fuelLevelToFilter);
                displayVehicles(filteredByFuelLevel, "Filtered Vehicles");
                break;
            case 7:
                System.out.print("Enter battery level to filter: ");
                double batteryLevelToFilter = scanner.nextDouble();
                scanner.nextLine();
                List<Vehicle> filteredByBatteryLevel = vehicleFiltering.filterByBatteryLevel(rentalSystem.getAvailableVehicles(), batteryLevelToFilter);
                displayVehicles(filteredByBatteryLevel, "Filtered Vehicles");
                break;
            case 8:
                System.out.print("Enter battery consumption to filter: ");
                double batteryConsumptionToFilter = scanner.nextDouble();
                scanner.nextLine();
                List<Vehicle> filteredByBatteryConsumption = vehicleFiltering.filterByBatteryConsumption(rentalSystem.getAvailableVehicles(), batteryConsumptionToFilter);
                displayVehicles(filteredByBatteryConsumption, "Filtered Vehicles");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }


    private void displayVehicles(List<Vehicle> vehicles, String title) {
        System.out.println("======== " + title + " ========");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }

    private void rentVehicle(RentalSystem rentalSystem) {
        System.out.println("======== Rent a Vehicle ========");
        displayVehicles(rentalSystem.getAvailableVehicles(), "Available Vehicles");
        System.out.print("Enter the index of the vehicle you want to rent: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        

        if (index >= 0 && index < rentalSystem.getAvailableVehicles().size()) {
            Vehicle selectedVehicle = rentalSystem.getAvailableVehicles().get(index);
      
            if (rentalSystem.getCustomers().isEmpty()) {
                System.out.println("No customers available. Please add a customer first.");
                return;
            }

            displayCustomers(rentalSystem.getCustomers());
            System.out.print("Enter the index of the customer: ");
            int customerIndex = scanner.nextInt();
            scanner.nextLine(); 

            if (customerIndex >= 0 && customerIndex < rentalSystem.getCustomers().size()) {
                Customer selectedCustomer = rentalSystem.getCustomers().get(customerIndex);

                double rentalCost = rentalSystem.calculateRentalCost(selectedVehicle, 1); 
                if (rentalCost <= selectedCustomer.getBudget()) {
                    rentalSystem.rentVehicle(selectedVehicle);
                    rentalSystem.updateFinances(rentalCost);
                    selectedCustomer.updateBudget(-rentalCost);
                    System.out.println("You have rented the following vehicle:");
                    selectedVehicle.displayInfo();
                } else {
                    System.out.println("Insufficient budget. Please choose a different vehicle or add funds.");
                }
            } else {
                System.out.println("Invalid customer index. Please try again.");
            }
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private void displayCustomers(List<Customer> customers) {
        System.out.println("======== Customers and Budgets ========");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + ". " + customers.get(i).getName() + " - Budget: $" + customers.get(i).getBudget());
        }
    }


   

    private void returnVehicle(RentalSystem rentalSystem) {
        System.out.println("======== Return a Vehicle ========");
        displayVehicles(rentalSystem.getRentedVehicles(), "Rented Vehicles");
        System.out.print("Enter the index of the vehicle you want to return: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 

        if (index >= 0 && index < rentalSystem.getRentedVehicles().size()) {
            Vehicle selectedVehicle = rentalSystem.getRentedVehicles().get(index);
            rentalSystem.returnVehicle(selectedVehicle);
            System.out.println("You have returned the following vehicle:");
            selectedVehicle.displayInfo();
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private void displayFinances(RentalSystem rentalSystem) {
        System.out.println("======== Finances ========");
        System.out.println("Total Finances: $" + rentalSystem.accessToFinances());
    }

    private void loadDataFromFile() {

   
    }

    private void saveDataToFile() {
    }

    private static void addCustomer(RentalSystem rentalSystem) {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine();
        rentalSystem.addCustomer(new Customer(name, budget, null));

        System.out.println("Customer added successfully.");
    }
    

    private static void addVehicle(RentalSystem rentalSystem) {
        System.out.println("1. Add car");
        System.out.println("2. Add scooter");
        System.out.println("3. Add bike");
        System.out.println("4. Add Electrical car");
        System.out.println("5. Add Electrical scooter");
        System.out.println("6. Add Electrical bike");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                addCar(rentalSystem);
                break;
            case 2:
                addScooter(rentalSystem);
                break;
            case 3:
                addBike(rentalSystem);
                break;
            case 4:
                addElectricCar(rentalSystem);
                break;
            case 5:
                addElectricScooter(rentalSystem);
                break;
            case 6:
                addElectricBike(rentalSystem);
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }

   

	private static void addCar(RentalSystem rentalSystem) {
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter hourly rental cost: ");
        double hourlyRentalCost = scanner.nextDouble();
        System.out.println("Enter daily rental cost: ");
        double dailyRentalCost = scanner.nextDouble();
        System.out.println("Enter number of doors: ");
        int numDoors = scanner.nextInt();
        System.out.println("Enter number of seats: ");
        int numberOfSeats = scanner.nextInt();
        System.out.println("Enter fuel type: ");
        String fuelType = scanner.nextLine();
        System.out.println("Enter fuel tank capacity: ");
        double fuelTankCapacity = scanner.nextDouble();
        System.out.println("Enter if the car is convertible: ");
        boolean isConvertible = scanner.nextBoolean();
        rentalSystem.addVehicle(new Car(brand, model, year, hourlyRentalCost, dailyRentalCost, numDoors, numberOfSeats, fuelType, fuelTankCapacity, isConvertible));
        
        

    }

    private static void addElectricBike(RentalSystem rentalSystem) {
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter hourly rental cost: ");
        double hourlyRentalCost = scanner.nextDouble();
        System.out.println("Enter daily rental cost: ");
        double dailyRentalCost = scanner.nextDouble();
        System.out.println("Max speed: ");
        int maxSpeed = scanner.nextInt();
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        scanner.nextLine();
              
        rentalSystem.addVehicle(new EBike(brand, model, year, hourlyRentalCost, dailyRentalCost, maxSpeed, color));
    }

    private static void addElectricScooter(RentalSystem rentalSystem) {
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter hourly rental cost: ");
        double hourlyRentalCost = scanner.nextDouble();
        System.out.println("Enter daily rental cost: ");
        double dailyRentalCost = scanner.nextDouble();
        System.out.println("Enter battery capacity: ");
        int batteryCapacity = scanner.nextInt();
        System.out.println("Enter max speed: ");
        int maxSpeed = scanner.nextInt();
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        System.out.println("Enter if the scooter is foldable: ");
        boolean isFoldable = scanner.nextBoolean();
        rentalSystem.addVehicle(new EScooter(brand, model, year, hourlyRentalCost, dailyRentalCost, batteryCapacity, maxSpeed, color, isFoldable));
    }

    private static void addElectricCar(RentalSystem rentalSystem) {
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter hourly rental cost: ");
        double hourlyRentalCost = scanner.nextDouble();
        System.out.println("Enter daily rental cost: ");
        double dailyRentalCost = scanner.nextDouble();
        System.out.println("Battery level: ");
        int batteryCapacity= scanner.nextInt();
        System.out.println("Enter battery usage: ");
        int batteryUsage = scanner.nextInt();
        System.out.println("Enter battery consumption: ");
        int batteryConsumption = scanner.nextInt();
        System.out.println("Enter if the car has autopilot: ");
        boolean hasAutopilot = scanner.nextBoolean();
        rentalSystem.addVehicle(new ECar(brand, model, year, hourlyRentalCost, dailyRentalCost, batteryCapacity, batteryUsage, batteryConsumption, hasAutopilot));
        
       
    }

    private static void addBike(RentalSystem rentalSystem) {
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter hourly rental cost: ");
        double hourlyRentalCost = scanner.nextDouble();
        System.out.println("Enter daily rental cost: ");
        double dailyRentalCost = scanner.nextDouble();
        System.out.println("Enter bike type: ");
        String bikeType = scanner.nextLine();
        System.out.println("Enter fuel level: ");
        int fuelLevel = scanner.nextInt();
        rentalSystem.addVehicle(new Bike(brand, model, year, hourlyRentalCost, dailyRentalCost, bikeType, fuelLevel));

    }

    private static void addScooter(RentalSystem rentalSystem) {
	}

   

}
