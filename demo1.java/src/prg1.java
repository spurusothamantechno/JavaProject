import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class prg1 {
    public static void main(String[] sgd){
        String URL="jdbc:mysql://localhost:3306/demo1";
        String USER="root";
        String PASSWORD="Navin@2004";
        try{
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Success");
            Statement selectStatement=con.createStatement();
            //create table
            String createTableSQL="CREATE  TABLE Book("
+"Id INT AUTO_INCREMENT PRIMARY KEY,"
+"Book_Name VARCHAR(20) NOT NULL,"
+"Aurthor_Name VARCHAR(18)NOT NULL,"
+"publish_date DATE NOT NULL,"
+"Email VARCHAR(35)NOT NULL"+")";
selectStatement.executeUpdate(createTableSQL);
System.out.println("Table created successfully");

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}