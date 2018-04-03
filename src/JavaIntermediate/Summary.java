package JavaIntermediate;

import java.util.*;

class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person o) {
        int length = name.length();
        int length1 = o.name.length();

        if(length > length1) {
            return 1;
        }
        else if(length < length1) {
            return -1;
        }
        else {
            return name.compareTo(o.name);
        }
    }

}

public class Summary {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        Summary.addElement(4, list);
        Collections.sort(list);
        Summary.getElement(list);

        Set<Person> set = new TreeSet<>();

        Summary.addElement(5, set);
        Summary.getElement(set);



//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Cat");
//        map.put(2, "Dog");
//        map.put(3, "Rabbit");
//
//        for (Integer key : map.keySet()) {
//            System.out.println("Key: " + key + " Value: " + map.get(key));
//        }

    }

    public static void addElement(int numPerson, Collection<Person> coll) {
            for (int i = 1; i <= numPerson; i++) {
                Scanner scanName = new Scanner(System.in);
                String inputName = scanName.next();
                Person person = new Person(inputName);
                coll.add(person);
        }
    }

    public static void getElement(Collection<Person> coll) {
            for (Person person : coll) {
                System.out.println(person);
            }
    }

}
