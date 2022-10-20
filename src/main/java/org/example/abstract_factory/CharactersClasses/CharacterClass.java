package org.example.abstract_factory.CharactersClasses;

import org.example.abstract_factory.DataElement;

/** Abstract class that defines Classes for our Characters
 * For every race we have health ('hp' attribute)
 **/
public abstract class CharacterClass implements DataElement {
    String name;
    int hp;

    public int getHP(){
        return  hp;
    }
    public abstract void printMagika();

    @Override
    public String toString() {
        return "Class " + name + "\n" +
                "Health=" + hp;
    }

    // For visitor pattern
    @Override
    public void accept() {
        System.out.println(this.toString());
    }
}
