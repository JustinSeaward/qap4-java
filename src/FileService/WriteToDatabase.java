package FileService;

import EntityClasses.Drug;
import DBConnection.Databaseconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteToDatabase {

    public void writeDataToDatabase(Drug drug){
        String query = "INSERT INTO Drugs (name, cost, dosage)" + "VALUES (?,?,?)";
        try {
            Connection con = Databaseconnection.getcon();
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, drug.getDrugName());
            statement.setDouble(2, drug.getDrugCost());
            statement.setString(3, drug.getDosage());
            int updateRow = statement.executeUpdate();
            System.out.println(updateRow);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
