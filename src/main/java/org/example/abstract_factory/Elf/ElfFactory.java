package org.example.abstract_factory.Elf;

import org.example.abstract_factory.RaceAbstractFactory;
import org.example.abstract_factory.Stats;

import java.util.HashMap;

public class ElfFactory implements RaceAbstractFactory {

    @Override
    public Elf create() {
        return new Elf(new Stats(0,2,0,0,0,1));
    }
}
