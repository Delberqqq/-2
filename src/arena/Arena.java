package arena;

import character.Character;
import observer.CharacterObserver;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<CharacterObserver> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public void attack(Character attacker, Character target) {
        System.out.println(attacker.getName() + " attacks " + target.getName());
        target.attack();
    }

    public void move(Character character) {
        character.move();
    }

    public void registerObserver(CharacterObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character) {
        for (CharacterObserver observer : observers) {
            observer.update(character);
        }
    }
}
