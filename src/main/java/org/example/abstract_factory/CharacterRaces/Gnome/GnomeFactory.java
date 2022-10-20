package org.example.abstract_factory.CharacterRaces.Gnome;

import org.example.abstract_factory.RaceAbstractFactory;
import org.example.abstract_factory.Stats;


public class GnomeFactory implements RaceAbstractFactory {
    @Override
    public Gnome create() {
        return  new Gnome(new Stats(0,0,1,2,0,0));
    }
}
