package resolves.HW72;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetrieveCars {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "yourusername";
        String password = "yourpassword";

        List<String> carModels = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String sql = "SELECT model FROM Car";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                carModels.add(rs.getString("model"));
            }
            System.out.println("Car models retrieved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Вивід списку моделей для перевірки
        System.out.println(carModels);
    }
}
