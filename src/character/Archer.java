package character;

public class Archer extends Character {

    public Archer(String name, int x, int y) {
        super(name, 120, 30, x, y); // Створення лучника з відповідними значеннями
    }

    @Override
    public void attack() {
        System.out.println(name + " the Archer attacks with power: " + attackPower);
    }

    @Override
    public void move() {
        System.out.println(name + " the Archer is moving!");
    }
}
