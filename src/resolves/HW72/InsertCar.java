package resolves.HW72;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertCar {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "yourusername";
        String password = "yourpassword";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Car (model, type, power, price, year) VALUES (?, ?, ?, ?, ?)")) {
            pstmt.setString(1, "Toyota Camry");
            pstmt.setString(2, "SEDAN");
            pstmt.setInt(3, 200);
            pstmt.setDouble(4, 30000);
            pstmt.setInt(5, 2020);
            pstmt.executeUpdate();

            System.out.println("Car inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
