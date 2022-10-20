package org.example.visitor.CharactersClasses;

public class Barbarian extends CharacterClass {
    private String perk;

    public Barbarian() {
        this.name = "Barbarian";
        this.perk = "Battle Rage";
        this.hp = 12;
    }

    @Override
    public void printMagika() {
        System.out.println(this.name + " have perk " + perk);
    }

}
