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
           String adminDetails = "insert into user(name, email, password, address, status) " + "values ('thrsh', 'thrsh@gmail.com', 'mrtzn', 'bukidnon', 'true')";
           String adminQuotesTable = "create table quotes ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "category varchar(50) not null, "
                    + "image_path varchar(500) not null"
                    + ")";

           Dbop.setDataOrDelete(adminQuotesTable, "Quotes Table Created Successfully!");
           Dbop.setDataOrDelete(userTable, "User Table Create Succesfully");
           Dbop.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
