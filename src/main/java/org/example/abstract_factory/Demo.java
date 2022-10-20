package org.example.abstract_factory;
import org.example.abstract_factory.CharacterRaces.Gnome.GnomeFactory;
import org.example.abstract_factory.CharactersClasses.ClassFactory;
import org.example.abstract_factory.visitor.ElementVisitor;

public class Demo {
    public static void main(String[] args) {
        ElementVisitor elementVisitor = new ElementVisitor();
        Character gnomeCharacter = new Character(
                "AlexGnommy",
                ClassFactory.getClass("Druid"),
                new GnomeFactory().create());
        gnomeCharacter.setAttributes(Stats.generate());


        elementVisitor.visit(gnomeCharacter);
        elementVisitor.visit(gnomeCharacter.getCharacterClass());
        elementVisitor.visit(gnomeCharacter.getRace());
        elementVisitor.visit(gnomeCharacter.getAttributes());

        /*gnomeCharacter.printCharacter();

        System.out.println("\t\tAttributes");
        gnomeCharacter.getAttributes().print();

        gnomeCharacter.addRaceBonuses();

        System.out.println("\t\tAfter adding bonuses");
        gnomeCharacter.getAttributes().print();*/


    }
}
