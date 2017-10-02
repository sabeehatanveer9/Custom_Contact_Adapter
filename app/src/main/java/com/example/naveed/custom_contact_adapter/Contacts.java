package com.example.naveed.custom_contact_adapter;

import java.util.ArrayList;

/**
 * Created by Naveed on 10/2/2017.
 */
public class Contacts {
    private String mName;
    private String num;
    private boolean mOnline;

    public Contacts(String name, boolean online, String no) {
        mName = name;
        num= no;
        //mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public String getNum() {
        return num;
    }

//    public boolean isOnline() {
//        return mOnline;
//    }

    private static int lastContact = 0;

    public static ArrayList<Contacts> createContactsList(int numContacts) {
        ArrayList<Contacts> contacts = new ArrayList<Contacts>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contacts("Person " + ++lastContact, i <= numContacts / 2, "033" + i+ "658391"));

        }

        return contacts;
    }
}
