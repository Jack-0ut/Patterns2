package org.example.visitor.CharacterRaces;

import org.example.visitor.DataElement;
import org.example.visitor.Stats;

/**
 * Abstract class that defines the Races our Characters could have
 * For every race we have name and bonuses
 **/
public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;

    public CharacterRace(Stats bonuses) {
        this.bonuses = bonuses;
    }


    public void print() {
        System.out.println("Race: " + name);
        System.out.println("\t\tBonuses");
        bonuses.print();

    }

    public abstract void sayTHM();


    public Stats getBonuses() {
        return bonuses;
    }

    // For visitor pattern
    @Override
    public void accept() {
        this.print();
    }
}
