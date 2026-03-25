import EntityClasses.Drug;
import EntityClasses.Patient;
import FileService.ReadFile;
import FileService.WriteFile;
import FileService.WriteToDatabase;

import java.util.Date;
import java.util.Scanner;

public interface Menu {
    public static void main(String[] args) {
        WriteFile writeSystem = new WriteFile();
        ReadFile readSystem = new ReadFile();
        WriteToDatabase writeDatabase = new WriteToDatabase();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            // Menu for the file/database read and write system.
            System.out.println("****** Read and Write Program ******");
            System.out.println();
            System.out.println("Enter a number for the corresponding option");
            System.out.println();
            System.out.println("    1. Write/save to text file");
            System.out.println("    2. Write/save to the database");
            System.out.println("    3. Read data from text file");
            System.out.println("    4. Read date from database");
            System.out.println("    Enter -1 to exit program");
            System.out.println();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    System.out.println("Enter patient Id: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter patient first name: ");
                    String patientFirstName = scanner.nextLine();
                    System.out.println("Enter patient last name: ");
                    String patientLastName = scanner.nextLine();
                    System.out.println("Enter patient date of birth (yyyy-mm-dd): ");
                    String patientDOB = scanner.nextLine();
                    writeSystem.writeToTextFile(new Patient(patientId,patientFirstName,patientLastName,patientDOB));
                    break;
                case 2:
                    System.out.println("Enter drug name: ");
                    String drugName = scanner.nextLine();
                    System.out.println("Enter drug cost: ");
                    Double drugCost = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter drug dosage: ");
                    String drugDosage = scanner.nextLine();
                    writeDatabase.writeDataToDatabase(new Drug(drugName,drugCost,drugDosage));
                    break;
                case 3:
                    System.out.println("Enter .txt file name to read: ");
                    String fileName = scanner.nextLine();
                    readSystem.readFromTextFile(fileName);
                    break;
                case -1:
                    quit = true;
                    System.out.println("System shutting down");
                    System.out.println("GoodBye");
                    break;

                default:
                System.out.println("Invalid option");
            }
        }




    }
}
