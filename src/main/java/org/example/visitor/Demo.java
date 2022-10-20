package org.example.visitor;
import org.example.visitor.CharacterRaces.Gnome.GnomeFactory;
import org.example.visitor.CharactersClasses.ClassFactory;
import org.example.visitor.visitor.ElementVisitor;

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
