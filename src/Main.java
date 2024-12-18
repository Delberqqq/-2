import character.Character;
import factory.*;
import arena.Arena;
import observer.*;

public class Main {
    public static void main(String[] args) {
        // Створення фабрик
        WarriorFactory warriorFactory = new WarriorFactory();
        MageFactory mageFactory = new MageFactory();
        ArcherFactory archerFactory = new ArcherFactory();

        // Створення арени та спостерігача
        Arena arena = new Arena();
        CharacterObserver observer = new CharacterObserverImpl();
        arena.registerObserver(observer);

        // Створення персонажів через фабрики
        Character warrior = warriorFactory.createCharacter("Arthur", 0, 0);
        Character mage = mageFactory.createCharacter("Merlin", 1, 1);
        Character archer = archerFactory.createCharacter("Robin", 2, 2);

        // Додавання персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Виконання дій
        arena.attack(warrior, mage);
        arena.move(warrior);
        arena.move(mage);
        arena.move(archer);
    }
}
