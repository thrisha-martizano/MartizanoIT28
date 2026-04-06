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
            String userTable = "create table user (userID int (5) primary key, name varchar(10) not null, email varchar(10) not null, password varchar(10) not null, address varchar(10) not null, UNIQUE(email))";
            Dbop.setDataOrDelete(userTable, "Table Create Succesfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
