package factory;

import character.Warrior;
import character.Character;

public class WarriorFactory extends CharacterFactory {

    @Override
    public Character createCharacter(String name, int x, int y) {
        return new Warrior(name, x, y);
    }
}
