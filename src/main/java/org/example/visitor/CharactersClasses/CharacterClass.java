package org.example.visitor.CharactersClasses;

import org.example.visitor.DataElement;
import org.example.visitor.visitor.DataElementsVisitor;

import java.util.TreeMap;

/** Abstract class that defines Classes for our Characters
 * For every race we have health ('hp' attribute)
 **/
public abstract class CharacterClass implements DataElement {
    String name;
    int hp;

    public abstract void printMagika();

    @Override
    public String toString() {
        return "Class " + name + "\n" +
                "Health=" + hp;
    }

    // Return Instance of elementsVisitor with this object
    @Override
    public TreeMap accept(DataElementsVisitor elementsVisitor) {
        return elementsVisitor.visit(this);
    }

    public int getHP(){
        return  hp;
    }

    public String getName() {return name;}
}
