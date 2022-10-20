package org.example.abstract_factory.visitor;

import org.example.abstract_factory.Character;
import org.example.abstract_factory.CharacterRaces.CharacterRace;
import org.example.abstract_factory.CharactersClasses.CharacterClass;
import org.example.abstract_factory.Stats;

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
