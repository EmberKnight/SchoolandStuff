package JavaAdvanced;

public class Team {

    public void createPlayer() {

        class Player {

            String name;
            int age;

            public Player(String _name, int _age) {
                name = _name;
                age = _age;
            }

            public void getPlayer() {
                System.out.println(this.name + " " + this.age);
            }

        }

        Player pl1 = new Player("Dennis", 24);
        Player pl2 = new Player("Denis", 22);

        pl1.getPlayer();
        pl2.getPlayer();

    }

}
