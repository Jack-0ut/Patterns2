package org.example.factory.Characters;

public abstract class CharacterClass {
    String name;
    int hp;

    public int getHP(){
        return  hp;
    }
    public abstract void printMagika();

    @Override
    public String toString() {
        return "Class " + name +
                ", health=" + hp;
    }
}
