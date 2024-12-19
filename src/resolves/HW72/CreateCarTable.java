package resolves.HW72;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCarTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "yourusername";
        String password = "yourpassword";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE Car (" +
                    "id INT AUTO_INCREMENT, " +
                    "model VARCHAR(255), " +
                    "type ENUM('SEDAN', 'COUPE', 'SPORT', 'SUV', 'TRUCK', 'VAN'), " +
                    "power INT, " +
                    "price DOUBLE, " +
                    "year INT, " +
                    "PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Table Car created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
