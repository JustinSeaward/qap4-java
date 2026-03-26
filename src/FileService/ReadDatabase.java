package FileService;

import DBConnection.Databaseconnection;
import EntityClasses.Drug;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadDatabase {

    public void readFromDatabase(){
        ArrayList<Drug> drugList = new ArrayList<>();
        try {
            String query = "SELECT * FROM Drugs";
            Connection con = Databaseconnection.getcon();
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                Drug drug = new Drug();
                drug.setDrugId(rs.getInt("id"));
                drug.setDrugName(rs.getString("name"));
                drug.setDrugCost(rs.getDouble("cost"));
                drug.setDosage(rs.getString("dosage"));
                drugList.add(drug);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("***** Drug(s) from database *****");
        System.out.println();
        for(Drug drug : drugList){
            System.out.println(drug);
        }
        System.out.println();
    }
}