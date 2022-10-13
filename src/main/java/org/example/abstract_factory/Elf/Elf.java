package org.example.abstract_factory.Elf;

import org.example.abstract_factory.CharacterRace;
import org.example.abstract_factory.Stats;

public class Elf extends CharacterRace {
    public Elf(Stats bonuses){
        super(bonuses);
        this.name = "Elf";
        this.health = 7;
        this.bonuses = bonuses;
    }

    @Override
    public void sayTHM() {
        System.out.println("I'm Elf! Elf! Elf!");
    }
}
