package DataHandler;
import java.io.*;
import RentalSystem.RentalSystem;

public class DataHandler implements Serializable {
    private final String FILENAME;

    public DataHandler(String filename) {
        this.FILENAME = filename;
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
