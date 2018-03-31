package JavaIntermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {

        Address test = new Address("Denis", "Teststreet 3", "Vienna");

        ArrayList<Address> addressList = new ArrayList<>();
        Address[] addressArray = {test};

        addressList.add(test);

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String street = scan.nextLine();
        String city = scan.nextLine();

        Address test2 = new Address(name, street, city);
        addressList.add(test2);

        addressArray[0] = test2;

        for (Address address : addressList) {
            System.out.println(address.getName() + "\n" + address.getStreet() + "\n" + address.getCity());
        }

        for (Address address : addressArray) {
            System.out.println(address.getName() + "\n" + address.getStreet() + "\n" + address.getCity());
        }

    }

}
