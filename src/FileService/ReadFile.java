package FileService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    // Method to read data from a .txt file
    public void readFromTextFile(String fileName){
        try{
            // new FileReader object
            FileReader fr = new FileReader(fileName + ".txt");
             System.out.println(fr.readAllAsString());
            fr.close();
        }
        catch(IOException e) {
            System.out.println("File with that name not found");
        }
    }
}
