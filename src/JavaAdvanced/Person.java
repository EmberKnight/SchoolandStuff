package JavaAdvanced;

public class Person {

    private String name;

    public Person(String _name) {
        setName(_name);
        printName();
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }
}
