package JavaIntermediate;

public class Employee {

    private int id;
    private String name;
    private int birthYear;

    public Employee(int id, String name, int birthYear) {
        setId(id);
        setName(name);
        setBirthYear(birthYear);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "ID: " + id +
                ", Name: " + name  +
                ", Birth year: " + birthYear;
    }
}
