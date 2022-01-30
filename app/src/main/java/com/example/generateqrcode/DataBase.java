package com.example.generateqrcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {
    final static String DATABASE = "d1mb7jgibu4c02";
    final static String PORT = "5432";
    final static String HOST = "ec2-34-255-225-151.eu-west-1.compute.amazonaws.com";
    final static String USER = "eudmllgxrygnev";
    final static String PASSWORD = "d650516a286d1db4b8823f83c16dde1bfbc182b4224a8f444efc595b8afc5e8c";

    final static String URL = "jdbc:postgresql://"+HOST+":"+PORT+"/"+DATABASE+"?sslmode=require";

    Statement createStatement = null;
    Connection conn = null;

    public DataBase(){
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(conn != null){
            try {
                createStatement = conn.createStatement();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public ArrayList<Contact> getAllContact() {
        ArrayList<Contact> contacts = null;
        String sql = "SELECT * FROM contact";
        ResultSet rs = null;
        try {
            rs = createStatement.executeQuery(sql);
            contacts = new ArrayList<>();
            while (rs.next()) {
                Contact actualContact = new Contact(rs.getInt("Id"), rs.getString("Country"), rs.getString("Email"), rs.getString("Name"));
                contacts.add(actualContact);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return contacts;
    }
}
