package character;

public class Mage extends Character {

    public Mage(String name, int x, int y) {
        super(name, 100, 40, x, y); // Створення мага з відповідними значеннями
    }

    @Override
    public void attack() {
        System.out.println(name + " the Mage attacks with power: " + attackPower);
    }

    @Override
    public void move() {
        System.out.println(name + " the Mage is moving!");
    }
}
