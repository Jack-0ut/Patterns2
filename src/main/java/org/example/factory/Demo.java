package org.example.factory;


public class Demo {
    public static void main(String[] args) {
        Character character = new Character("Johnny",ClassFactory.getClass("Druid"));

        character.setAttributes(Stats.generate());

        character.talk();

    }
}
