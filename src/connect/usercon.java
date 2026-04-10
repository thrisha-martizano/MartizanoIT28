/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import martizanoit28.User;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Thrisha Mae
 */
public class usercon {

    public static void save(User user) {
        String status = (user.getStatus() == null) ? "false" : user.getStatus();
        String query = "insert into user (name, email, password, address, status) "
                + "values ('" + user.getName() + "','" + user.getEmail() + "','" + user.getPassword() + "','" + user.getAddress() + "','" + status + "')";
        Dbop.setDataOrDelete(query, "Registered Successfully");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = Dbop.getData("select * from user where email = '" + email + "' and password = '" + password + "'");

            if (rs != null) {
                while (rs.next()) {
                    user = new User();
                    user.setStatus(rs.getString("status"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Dbop.getData("select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("Id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status='" + status + "' where email='" + email + "'";
        Dbop.setDataOrDelete(query, "Status Changed Successfully");
    }

}
