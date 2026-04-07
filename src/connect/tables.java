/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import javax.swing.JOptionPane;

/**
 *
 * @author Thrisha Mae
 */
public class tables {
    public static void main(String[] args){
        try{
           String userTable = "create table user (id int AUTO_INCREMENT primary key,name varchar(50) not null, email varchar(150) not null, password varchar(10) not null, address varchar(100) not null, status varchar(10), UNIQUE(email))";
            //String adminDetails = "insert into user(name, email, password, address, status) " + "values ('heroniiis', 'adfs@gmail.com', 'ssdid', 'Canada', 'true')";
           Dbop.setDataOrDelete(userTable, "Table Create Succesfully");
            //Dbop.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
