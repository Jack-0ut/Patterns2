package org.example.visitor.visitor;

import org.example.visitor.Character;
import org.example.visitor.CharacterRaces.CharacterRace;
import org.example.visitor.CharactersClasses.CharacterClass;
import org.example.visitor.Stats;

/**
 * interface that define all objects we could visit
 */

public interface DataElementsVisitor {
    public void visit(Character character);

    public void visit(CharacterRace characterRace);

    public void visit(CharacterClass characterClass);

    public void visit(Stats stats);
}
