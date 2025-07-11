package Aufin;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "I2s32004$$";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1.Insert 2.View 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("ID Name Age: ");
                        int id = sc.nextInt(); String name = sc.next(); int age = sc.nextInt();
                        String insert = "INSERT INTO student VALUES (?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insert);
                        ps1.setInt(1, id); ps1.setString(2, name); ps1.setInt(3, age);
                        ps1.executeUpdate();
                        System.out.println("Inserted.");
                        break;
                    case 2:
                        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM student");
                        while (rs.next())
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                        break;
                    case 3:
                        System.out.print("ID NewName NewAge: ");
                        id = sc.nextInt(); name = sc.next(); age = sc.nextInt();
                        String update = "UPDATE student SET name=?, age=? WHERE id=?";
                        PreparedStatement ps2 = con.prepareStatement(update);
                        ps2.setString(1, name); ps2.setInt(2, age); ps2.setInt(3, id);
                        ps2.executeUpdate();
                        System.out.println("Updated.");
                        break;
                    case 4:
                        System.out.print("ID to delete: ");
                        id = sc.nextInt();
                        String delete = "DELETE FROM student WHERE id=?";
                        PreparedStatement ps3 = con.prepareStatement(delete);
                        ps3.setInt(1, id);
                        ps3.executeUpdate();
                        System.out.println("Deleted.");
                        break;
                    case 5:
                        sc.close(); con.close(); return;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
