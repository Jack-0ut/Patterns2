package org.example.visitor.CharacterRaces.Elf;

import org.example.visitor.CharacterRaces.CharacterRace;
import org.example.visitor.Stats.Stats;

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
