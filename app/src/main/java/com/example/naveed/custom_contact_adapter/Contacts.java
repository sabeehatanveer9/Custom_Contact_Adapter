package com.example.naveed.custom_contact_adapter;

import java.util.ArrayList;


public class Contacts {
    private String mName;
    private String num;


    public Contacts(String name, String no) {
        mName = name;
        num= no;

    }

    public String getName() {
        return mName;
    }

    public String getNum() {
        return num;
    }

    private static int lastContact = 0;

    public static ArrayList<Contacts> createContactsList(int numContacts) {
        ArrayList<Contacts> contacts = new ArrayList<Contacts>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contacts("Person " + ++lastContact, "033" + i+ "658391"));

        }

        return contacts;
    }
}
