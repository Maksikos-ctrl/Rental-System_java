
import Cars.Car;
import DataHandler.DataHandler;
import RentalSystem.RentalSystem;
import Scooters.Scooter;
import Bikes.EBike;


public class Main {

    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler("rental_system_data.ser");
        RentalSystem rentalSystem = dataHandler.loadData(); 

        if (rentalSystem == null) {
            rentalSystem = initializeRentalSystem();
        }

        UI ui = new UI();
        ui.run(rentalSystem);
    }

    private static RentalSystem initializeRentalSystem() {
        RentalSystem rentalSystem = new RentalSystem("MyRentalSystem");

        // test data
        rentalSystem.addVehicle(new Car("Toyota", "Camry", 2022, 10.0, 70.0, 4, 5, "Gasoline", 60.0, false));
        rentalSystem.addVehicle(new Scooter("Vespa", "Sprint", 2020, 3.0, 20.0, 5, 45, "Classic", true));
        rentalSystem.addVehicle(new EBike("Giant", "Fastroad", 2021, 5.0, 30.0, 50, "green"));

        return rentalSystem;
    }
}
