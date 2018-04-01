package JavaIntermediate;

public class Main {

    public static void main(String[] args) {

        Smartphone test = new Smartphone();
        test.addContact(Contacts.createContact("Dennis", 800));
        test.addContact(Contacts.createContact("Denis", 200));
        test.findContact("Dennis");
        test.printString();

    }

}
