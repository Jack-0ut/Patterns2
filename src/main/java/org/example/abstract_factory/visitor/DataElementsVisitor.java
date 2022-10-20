package org.example.abstract_factory.visitor;

import org.example.abstract_factory.Character;
import org.example.abstract_factory.CharacterRaces.CharacterRace;
import org.example.abstract_factory.CharactersClasses.CharacterClass;
import org.example.abstract_factory.Stats;

/**
 * interface that define all objects we could visit
 */

public interface DataElementsVisitor {
    public void visit(Character character);

    public void visit(CharacterRace characterRace);

    public void visit(CharacterClass characterClass);

    public void visit(Stats stats);
}
