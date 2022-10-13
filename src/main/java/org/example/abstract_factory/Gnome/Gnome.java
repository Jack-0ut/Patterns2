package org.example.abstract_factory.Gnome;

import org.example.abstract_factory.CharacterRace;
import org.example.abstract_factory.Stats;

public class Gnome extends CharacterRace {
    public Gnome(Stats bonuses){
        super(bonuses);
        this.name = "Gnome";
        this.health = 6;
        this.bonuses = bonuses;
    }

    @Override
    public void sayTHM() {
        System.out.println("I'm Gnome! Hah-Hah-Hah");
    }
}
