package EntityClasses;

public class Drug {
    // Instance variables
    private int drugId;
    private String drugName;
    private double drugCost;
    private String dosage;

    // Constructors
    public Drug(){};

    public Drug( String drugName, double drugCost, String dosage){
        this.drugName = drugName;
        this.drugCost = drugCost;
        this.dosage = dosage;
    }

    public Drug(int drugId, String drugName, double drugCost, String dosage){
        this.drugId = drugId;
        this.drugName = drugName;
        this.drugCost = drugCost;
        this.dosage = dosage;
    }

    // Getters and setters
    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDrugCost() {
        return drugCost;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    // toString method
    @Override
    public String toString() {
        return "Drug Id: " + this.drugId + "," + "Name: " + this.drugName + "," + "Cost: $" + this.drugCost + "," + "Dosage: " + this.dosage;
    }
}
