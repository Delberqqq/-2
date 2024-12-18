package factory;

import character.Archer;
import character.Character;

public class ArcherFactory extends CharacterFactory {

    @Override
    public Character createCharacter(String name, int x, int y) {
        return new Archer(name, x, y);
    }
}
