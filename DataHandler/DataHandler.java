package DataHandler;
import java.io.*;
import RentalSystem.RentalSystem;

public class DataHandler implements Serializable {
    private final String FILENAME; // the name of the file to be used for data storage

    /**
     * Constructs a new DataHandler object with the specified filename.
     * 
     * @param filename the name of the file to be used for data storage
     */

    public DataHandler(String filename) {
        this.FILENAME = filename;
    }

    /**
     * Saves the data of the RentalSystem object to a file.
     * 
     * @param rentalSystem the RentalSystem object to be saved
     */
    public void saveData(RentalSystem rentalSystem) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(rentalSystem);
            System.out.println("Data saved to file successfully!");
            System.out.println("Adress of rental system: " + rentalSystem);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to save data to file.");
        }
    }

    /**
     * Loads the rental system data from a file.
     * 
     * @return The loaded RentalSystem object.
     */
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
