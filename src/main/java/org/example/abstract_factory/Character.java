package org.example.abstract_factory;

import java.util.Set;

public class Character {
    private String name;
    private Stats attributes;
    private CharacterRace race;
    private int health;

    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;
    }

    public void talk(){
        System.out.println("Hello, I'm " + this.name);
    }
    public void printCharacter(){
        System.out.println("Name: " + name);
        race.print();
    }
    public void addRaceBonuses(){
        Set<String> attributesKeySet = attributes.getStats().keySet();
        for(String key: attributesKeySet){
            int newStat = attributes.getStats().get(key) + race.getBonuses().getStats().get(key);
            attributes.getStats().put(key,newStat);
        }
    }



    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }
}
