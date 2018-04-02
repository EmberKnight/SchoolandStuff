package JavaIntermediate;

import java.util.*;

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    public String toString() {
        return "ID: " + this.id + " Name: " + this.name;
    }
}



public class TestSet {

    public static void main(String[] args) {
//        Set<String> set = new TreeSet<>();
        Set<Person> set1 = new HashSet<>();
//        Set<String> set2 = new LinkedHashSet<>();

        Person p1 = new Person(1, "Dennis");
        Person p2 = new Person(2, "Max");
        Person p3 = new Person(3, "Denis");
        Person p4 = new Person(1, "Dennis");

//        set.add("Dennis");
//        set.add("Denis");

        set1.add(p1);
        set1.add(p2);
        set1.add(p3);
        set1.add(p4);

        for (Person person : set1) {
            System.out.println(person);
        }
    }
}
//        set2.add("Christian");
//        set2.add("Jonas");
//
//        TestSet.getElement(set);
//        TestSet.getElement(set1);
//        TestSet.getElement(set2);
//    }
//
//    public static void getElement(Collection<String> collection) {
//        for (String string : collection) {
//            System.out.println(string);
//        }
//    }


