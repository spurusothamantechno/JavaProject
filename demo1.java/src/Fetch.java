import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/demo1";
        String USER = "root";
        String PASSWORD = "Navin@2004";

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Read Operation
            String selectSQL = " SELECT * FROM Books";
            Statement selectStatement = con.createStatement();
            ResultSet resultSet = selectStatement.executeQuery(selectSQL);

            System.out.println("Read operation results:");
            while (resultSet.next()) {
                // Corrected column names to match your table schema
                System.out.println("ID: " + resultSet.getInt("Id")
                    + ", Book Name: " + resultSet.getString("Book_Name")
                    + ", Aurthor Name: " + resultSet.getString("Aurthor_Name")
                    + ", Published Date: " + resultSet.getDate(  "publish_date")
                    + ", Email: " + resultSet.getString("Email"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}