package org.example.visitor.visitor;

import com.sun.source.tree.Tree;
import org.example.visitor.Character;
import org.example.visitor.CharacterRaces.CharacterRace;
import org.example.visitor.CharactersClasses.CharacterClass;
import org.example.visitor.Stats.Stats;

import java.util.TreeMap;

/**
 * interface that define all objects we could visit
 */

public interface DataElementsVisitor {
    public TreeMap visit(Character character);

    public TreeMap visit(CharacterRace characterRace);

    public TreeMap visit(CharacterClass characterClass);

    public TreeMap visit(Stats stats);
}
