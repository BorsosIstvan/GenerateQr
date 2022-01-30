package com.example.generateqrcode;

import java.util.ArrayList;

public class GetContacts {
    public static String getContacts(){
        DataBase db = new DataBase();
        ArrayList<Contact> contacts = db.getAllContact();
        String cs = "";
        for(Contact c : contacts){
            cs = cs+c.getName()+" | "+c.getCountry()+" | "+c.getEmail()+"\n";
        }
        return cs;
    }


}
