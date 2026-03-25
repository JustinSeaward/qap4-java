package FileService;

import EntityClasses.Patient;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void writeToTextFile(Patient patient){
        try{
            FileWriter fw = new FileWriter("Patients.txt");
            fw.write(patient.toString());
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
