package DataHandler;
import java.io.*;
import java.util.List;

import RentalSystem.RentalSystem;

public class DataHandler implements Serializable {
    private static final String FILENAME = "rental_system_data.ser";

    public DataHandler(String filename) {
        filename = FILENAME;
    }

    public void saveData(RentalSystem rentalSystem) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(rentalSystem);
            System.out.println("Data saved to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to save data to file.");
        }
    }

    public RentalSystem loadData() {
        RentalSystem rentalSystem = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            rentalSystem = (RentalSystem) ois.readObject();
            System.out.println("Data loaded successfully!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failed to load data from file.");
        }
        return rentalSystem;
    }
}
