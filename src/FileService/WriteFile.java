package FileService;

import EntityClasses.Patient;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void writeToTextFile(String fileName, Patient patient){
        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(patient.toString());
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
