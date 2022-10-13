package org.example.factory;

import org.example.factory.Characters.CharacterClass;

public class Character {
    private String name;
    private Stats attributes;
    private String race;
    private CharacterClass dndClass;
    private int health;

    public Character(String name, CharacterClass dndClass) {
        this.name = name;
        this.dndClass = dndClass;
        this.health = dndClass.getHP();
        System.out.println("Name: " + name);
        System.out.println(dndClass.toString());
        dndClass.printMagika();
    }

    public void talk(){
        System.out.println("Hello, I'm " + this.name);
    }

    private void updateHealth(){
        this.health += Math.floor(attributes.getStats().get("Constitution") /2) -5;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
        updateHealth();
        System.out.println("\n\nNew health: " + this.health);
    }
}
