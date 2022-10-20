package org.example.abstract_factory.CharactersClasses;

import org.example.abstract_factory.CharactersClasses.Barbarian;
import org.example.abstract_factory.CharactersClasses.CharacterClass;
import org.example.abstract_factory.CharactersClasses.Druid;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if(type == "Barbarian") return  new Barbarian();
        if(type == "Druid") return  new Druid();
        return null;
    }
}
