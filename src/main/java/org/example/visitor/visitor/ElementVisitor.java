package org.example.visitor.visitor;

import com.sun.source.tree.Tree;
import org.example.visitor.Character;
import org.example.visitor.CharacterRaces.CharacterRace;
import org.example.visitor.CharactersClasses.CharacterClass;
import org.example.visitor.Stats.Stats;

import java.util.TreeMap;

/**
 * Implements DataElementsVisitor interface
 * and define visit method for all objects to visit
 **/
public class ElementVisitor implements DataElementsVisitor {
    @Override
    public TreeMap visit(Character character) {
        TreeMap characterMap = new TreeMap();
        characterMap.put("Name",character.getName());
        characterMap.put("Health",character.getHealth());
        return characterMap;
    }

    @Override
    public TreeMap visit(CharacterRace characterRace) {
        TreeMap characterRaceMap = new TreeMap();
        characterRaceMap.put("Race",characterRace.getName());
        return characterRaceMap;
    }

    @Override
    public TreeMap visit(CharacterClass characterClass) {
        TreeMap characterClassMap = new TreeMap();
        characterClassMap.put("Class",characterClass.getName());
        return characterClassMap;
    }

    @Override
    public TreeMap visit(Stats stats) {
        TreeMap attributesMap = new TreeMap();
        attributesMap.put("Attributes",stats.getStats());
        return attributesMap;
    }
}
