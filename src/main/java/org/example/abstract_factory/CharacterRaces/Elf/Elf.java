package org.example.abstract_factory.CharacterRaces.Elf;

import org.example.abstract_factory.CharacterRaces.CharacterRace;
import org.example.abstract_factory.Stats;

public class Elf extends CharacterRace {
    public Elf(Stats bonuses){
        super(bonuses);
        this.name = "Elf";
        this.bonuses = bonuses;
    }

    @Override
    public void sayTHM() {
        System.out.println("I'm Elf! Elf! Elf!");
    }
}
