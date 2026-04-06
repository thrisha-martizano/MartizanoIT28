/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;
import martizanoit28.User;
/**
 *
 * @author Thrisha Mae
 */
public class usercon {
    public static void save(User user){
        String query = "insert into user(name,email,password,address) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getAddress()+"')";
        Dbop.setDataOrDelete(query,"Registered Successfully");
    }
    
}
