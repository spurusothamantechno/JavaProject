import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update1 {
    // Make these variables static so they can be accessed in the static main method
    private static final String URL = "jdbc:mysql://localhost:3306/demo1";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Navin@2004"; 

    public static void main(String[] upd) {
        try {
            // Connection to the database
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Update Operation - Corrected SQL query
            String updateSQL = "UPDATE Books SET Email = ? WHERE Book_Name = ? AND Aurthor_Name = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateSQL);

            // Set the new email and the name to update
            updateStatement.setString(1, "navin10@gmail.com"); // New email
            updateStatement.setString(2, "Harry potter(part1)");  // First name (F_Name)
            updateStatement.setString(3, "J.K.Rowling");  // Last name (L_Name)

            // Execute the update
            int rowsUpdated = updateStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Update operation completed. Rows updated: " + rowsUpdated);
            } else {
                System.out.println("No rows updated. Check the provided names.");
            }

        } catch (SQLException e) {
            System.out.println("Error during update: " + e.getMessage());
        }
    }
}
