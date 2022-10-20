package org.example.visitor.CharacterRaces.Elf;

import org.example.visitor.RaceAbstractFactory;
import org.example.visitor.Stats;

public class ElfFactory implements RaceAbstractFactory {

    @Override
    public Elf create() {
        return new Elf(new Stats(0,2,0,0,0,1));
    }
}
