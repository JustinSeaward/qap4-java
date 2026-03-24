package EntityClasses;

import java.time.LocalDate;
import java.sql.Date;

public class Patient {
    // Instance variables
    private int patientId;
    private String patientFirstName;
    private String patientLastName;
    private Date patientDOB;

    // Constructors
    public Patient(){}

    public Patient(int patientId, String patientFirstName, String patientLastName, Date patientDOB){
        this.patientId = patientId;
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientDOB = patientDOB;
    }

    // Getters and setters

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }


    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public Date getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(Date patientDOB) {
        this.patientDOB = patientDOB;
    }

    // toString method
    @Override
    public String toString() {
        return "Patient Id: " + this.patientId + ","  + " First name: " + this.patientFirstName + "," +" Last name: " + this.patientLastName + "," + "Date of birth: " + this.patientDOB;
    }
}
