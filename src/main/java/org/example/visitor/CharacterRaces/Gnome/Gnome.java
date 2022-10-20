package org.example.visitor.CharacterRaces.Gnome;

import org.example.visitor.CharacterRaces.CharacterRace;
import org.example.visitor.Stats;

public class Gnome extends CharacterRace {
    public Gnome(Stats bonuses){
        super(bonuses);
        this.name = "Gnome";
        this.bonuses = bonuses;
    }

    @Override
    public void sayTHM() {
        System.out.println("I'm Gnome! Hah-Hah-Hah");
    }
}
