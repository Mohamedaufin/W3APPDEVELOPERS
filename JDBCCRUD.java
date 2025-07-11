package Aufin;

import java.sql.*;
import java.util.Scanner;

public class JDBCCRUD {
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
                if (ch == 1) {
                    System.out.print("ID Name Age: ");
                    int id = sc.nextInt(); String name = sc.next(); int age = sc.nextInt();
                    String q = "INSERT INTO student VALUES (?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setInt(1, id); ps.setString(2, name); ps.setInt(3, age);
                    ps.executeUpdate();
                } else if (ch == 2) {
                    ResultSet rs = con.createStatement().executeQuery("SELECT * FROM student");
                    while (rs.next())
                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                } else if (ch == 3) {
                    System.out.print("ID NewName NewAge: ");
                    int id = sc.nextInt(); String name = sc.next(); int age = sc.nextInt();
                    String q = "UPDATE student SET name=?, age=? WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setString(1, name); ps.setInt(2, age); ps.setInt(3, id);
                    ps.executeUpdate();
                } else if (ch == 4) {
                    System.out.print("ID to delete: ");
                    int id = sc.nextInt();
                    String q = "DELETE FROM student WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setInt(1, id);
                    ps.executeUpdate();
                } else break;
            }
            sc.close();       // ✅ Close Scanner here
            con.close();      // ✅ Close Connection here
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
