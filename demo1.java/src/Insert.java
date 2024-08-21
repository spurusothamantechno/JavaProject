import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/demo1";
        String USER = "root";
        String PASSWORD = "Navin@2004";

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Corrected query for inserting data into the Employee table
            String insertSQL = "INSERT INTO Books (Id, Book_Name, Aurthor_Name, Email, publish_date) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement insertStatement = con.prepareStatement(insertSQL);
            insertStatement.setInt(1, 10); // Id
            insertStatement.setString(2, "Harry potter(part1)");
            insertStatement.setString(3, "J.K.Rowling");
            insertStatement.setString(5, "1997-06-26"); // Joining_date in proper format 'YYYY-MM-DD'
            insertStatement.setString(4, "navinazhagu10@gmail.com");
            insertStatement.executeUpdate();
            System.out.println("Insert operation completed successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
