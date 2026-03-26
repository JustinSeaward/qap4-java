package FileService;

import EntityClasses.Patient;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    // method to write data to a text file
    public void writeToTextFile(Patient patient){
        try{
            // new FileWriter object
            FileWriter fw = new FileWriter("Patients.txt", true);
            fw.write(patient.toString() + "\n");
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
