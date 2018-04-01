package JavaIntermediate;

import java.util.*;

public class Smartphone {

    private List<Contacts> myContacts;

    public Smartphone() {
        myContacts = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts newContact) {
        for (Contacts contactInList : myContacts) {
            if (newContact.getName().equals(contactInList.getName())) {
                System.out.println("Contact already exists!");
                return false;
            }
        }
        myContacts.add(newContact);
        System.out.println("Contact added");
        return true;
    }

    public boolean findContact(String contactName) {
        for (Contacts contactInList : myContacts) {
            if (contactName.equals(contactInList.getName())) {
                contactInList.getName();
                System.out.println("Contact found: " + contactName);
                return true;
            }
        }
        System.out.println("Contact not found");
        return false;
    }

    public void printString() {
        for (Contacts contactInList : myContacts) {
            System.out.println("Name: " + contactInList.getName() + "\n" + "Phone number: " +
                    +contactInList.getPhoneNumber());
        }
    }

}
