package org.example.abstract_factory;

import org.example.abstract_factory.Gnome.GnomeFactory;

public class Demo {
    public static void main(String[] args) {
        Character gnomeCharacter = new Character("AlexGnommy",new GnomeFactory().create());
        gnomeCharacter.printCharacter();

        gnomeCharacter.setAttributes(Stats.generate());
        System.out.println("\t\tAttributes");
        gnomeCharacter.getAttributes().print();

        gnomeCharacter.addRaceBonuses();

        System.out.println("\t\tAfter adding bonuses");
        gnomeCharacter.getAttributes().print();

    }
}
