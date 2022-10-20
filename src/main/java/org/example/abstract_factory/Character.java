package org.example.abstract_factory;

import org.example.abstract_factory.CharacterRaces.CharacterRace;
import org.example.abstract_factory.CharactersClasses.CharacterClass;

import java.util.Set;

/**
 * Class that contains all information about character :
 * Name, Attributes, Race,Class
 **/
public class Character implements DataElement {
    private String name;
    private Stats attributes;
    private CharacterRace race;
    private CharacterClass characterClass;

    public Character(String name, CharacterClass characterClass, CharacterRace race) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
    }

    public void talk() {
        System.out.println("Hello, I'm " + this.name);
    }

    public void printCharacter() {
        System.out.println("Name: " + name);
        System.out.println(characterClass.toString());
        race.print();
    }

    // Adding bonuses to stats based on the character race
    public void addRaceBonuses() {
        Set<String> attributesKeySet = attributes.getStats().keySet();
        for (String key : attributesKeySet) {
            int newStat = attributes.getStats().get(key) + race.getBonuses().getStats().get(key);
            attributes.getStats().put(key, newStat);
        }
    }

    public Stats getAttributes() {
        return attributes;
    }

    public CharacterRace getRace() {
        return race;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    // For visitor pattern
    @Override
    public void accept() {
        System.out.println("Name :" + this.name);
    }
}
