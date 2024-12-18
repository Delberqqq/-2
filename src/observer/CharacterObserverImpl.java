package observer;

import character.Character;

public class CharacterObserverImpl implements CharacterObserver {

    @Override
    public void update(Character character) {
        System.out.println("Character " + character.getName() + " has been added to the arena.");
    }
}
