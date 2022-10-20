package org.example.visitor.visitor;

import org.example.visitor.Character;
import org.example.visitor.CharacterRaces.CharacterRace;
import org.example.visitor.CharactersClasses.CharacterClass;
import org.example.visitor.Stats;

/**
 * Implements DataElementsVisitor interface
 * and define visit method for all objects to visit
 **/
public class ElementVisitor implements DataElementsVisitor {
    @Override
    public void visit(Character character) {
        character.accept();
    }

    @Override
    public void visit(CharacterRace characterRace) {
        characterRace.accept();
    }

    @Override
    public void visit(CharacterClass characterClass) {
        characterClass.accept();
    }

    @Override
    public void visit(Stats stats) {
        stats.accept();
    }
}
