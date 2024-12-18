package factory;

import character.Mage;
import character.Character;

public class MageFactory extends CharacterFactory {

    @Override
    public Character createCharacter(String name, int x, int y) {
        return new Mage(name, x, y);
    }
}
