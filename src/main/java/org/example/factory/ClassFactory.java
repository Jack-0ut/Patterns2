package org.example.factory;

import org.example.factory.Characters.Barbarian;
import org.example.factory.Characters.CharacterClass;
import org.example.factory.Characters.Druid;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if(type == "Barbarian") return  new Barbarian();
        if(type == "Druid") return  new Druid();
        return null;
    }
}
