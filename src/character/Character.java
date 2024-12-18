package character;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y; // координати

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public abstract void attack();

    public abstract void move();

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPosition() {
        System.out.println(name + " is at position (" + x + ", " + y + ")");
    }
}
