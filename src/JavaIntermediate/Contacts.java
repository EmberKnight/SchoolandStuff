package JavaIntermediate;

public class Contacts {

    private String name;
    private int phoneNumber;

    public Contacts(String name, int phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    /*-------------------------------------- getter and setter ------------------------------------*/

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    /*---------------------------------------------------------------------------------------------*/

    public static Contacts createContact(String name, int phoneNumber) {
        return new Contacts(name, phoneNumber);
    }

}
