/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import martizanoit28.User;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Thrisha Mae
 */
public class usercon {
    public static void save(User user){
        String status = (user.getStatus() == null) ? "false" : user.getStatus();
        String query = "insert into user (name, email, password, address, status) " +
                       "values ('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getAddress()+"','"+status+"')";
        Dbop.setDataOrDelete(query, "Registered Successfully");
    }
    
    public static User login(String email, String password){
        User user = null;
        try {
            ResultSet rs = Dbop.getData("select * from user where email = '" + email + "' and password = '" + password + "'");
            
            if (rs != null) {
                while(rs.next()){
                    user = new User();
                    user.setStatus(rs.getString("status"));
                }
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
}
