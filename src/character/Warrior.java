package character;

public class Warrior extends Character {

    public Warrior(String name, int x, int y) {
        super(name, 150, 20, x, y); // Створення воїна з відповідними значеннями
    }

    @Override
    public void attack() {
        System.out.println(name + " the Warrior attacks with power: " + attackPower);
    }

    @Override
    public void move() {
        System.out.println(name + " the Warrior is moving!");
    }
}
