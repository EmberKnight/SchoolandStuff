package JavaAdvanced;

public class Main {

    public static void main(String[] args) {

//        Team tm = new Team();
//        tm.createPlayer();

        Person p1 = new Person("Dennis");

        new Person("Denis") {
            @Override
            public void printName() {
                System.out.println(this.getName());
            }
        };

        Dog dog = new Dog();
        dog.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();

        Animal elephant = new Animal() {
            @Override
            public String makeNoise() {
                return null;
            }
        };

    }

}
