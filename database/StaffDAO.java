package database;

import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {
    public void insertStaff(Staff staff) {
        String sql = "INSERT INTO staff (name, salary, experience_years, staff_type, specialization) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, staff.getName());
            stmt.setDouble(2, staff.getSalary());
            stmt.setInt(3, staff.getExperienceYears());

            if (staff instanceof Chef) {
                stmt.setString(4, "CHEF");
                stmt.setString(5, ((Chef) staff).getSpecialization());
            }

            else { stmt.setString(4, "WAITER");
                stmt.setNull(5, Types.VARCHAR);
            }

            stmt.executeUpdate(); System.out.println("Staff added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Staff> searchByName(String name) {
        List<Staff> list = new ArrayList<>();
        String sql = "SELECT * FROM staff WHERE name ILIKE ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + name + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new Chef(rs.getInt("staff_id"),
                        rs.getString("name"),
                        rs.getDouble("salary"),
                        rs.getInt("experience_years"),
                        rs.getString("specialization")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean deleteStaff(int id) {
        String sql = "DELETE FROM staff WHERE staff_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
        catch (SQLException e) {
            e.printStackTrace(); return false;
        }
    }
}