package org.example.visitor.CharacterRaces.Gnome;

import org.example.visitor.RaceAbstractFactory;
import org.example.visitor.Stats.Stats;


public class GnomeFactory implements RaceAbstractFactory {
    @Override
    public Gnome create() {
        return  new Gnome(new Stats(0,0,1,2,0,0));
    }
}
