package org.example.visitor;

import org.example.visitor.CharacterRaces.CharacterRace;
import org.example.visitor.CharactersClasses.CharacterClass;
import org.example.visitor.Stats.Stats;
import org.example.visitor.visitor.DataElementsVisitor;

import java.util.Set;
import java.util.TreeMap;

/**
 * Class that contains all information about character :
 * Name, Attributes, Race,Class
 **/
public class Character implements DataElement {
    private String name;
    private int health;
    private Stats attributes;
    private CharacterRace race;
    private CharacterClass characterClass;



    public Character(String name, CharacterClass characterClass, CharacterRace race) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.health = characterClass.getHP();
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




    // For visitor pattern
    @Override
    public TreeMap accept(DataElementsVisitor elementsVisitor) {
        return elementsVisitor.visit(this);
    }

    public CharacterClass getCharacterClass() {return characterClass;}

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
        this.health += Math.floor(this.attributes.getStats().get("Constitution") /2) -5;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public CharacterRace getRace() {
        return race;
    }

    public int getHealth() {return health;}

    public String getName() {return name;}

}
