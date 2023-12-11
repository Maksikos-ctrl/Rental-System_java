package DataHandler;
import java.io.*;
import java.util.List;

import RentalSystem.RentalSystem;

public class DataHandler {
    private String filename;

    public DataHandler(String filename) {
        this.filename = filename;
    }

    public void saveData(RentalSystem rentalSystem) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(rentalSystem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public RentalSystem loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            
            if (ois.available() > 0) {
                return (RentalSystem) ois.readObject();
            } else {
                System.out.println("File is empty. Returning a new instance of RentalSystem.");
                return new RentalSystem(filename); 
            }
        } catch (EOFException e) {
            System.out.println("End of file reached. Returning a new instance of RentalSystem.");
            return new RentalSystem(filename); 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
