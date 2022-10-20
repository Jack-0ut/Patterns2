package org.example.abstract_factory.CharacterRaces.Gnome;

import org.example.abstract_factory.CharacterRaces.CharacterRace;
import org.example.abstract_factory.Stats;

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
