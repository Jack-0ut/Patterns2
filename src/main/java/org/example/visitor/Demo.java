package org.example.visitor;
import org.example.visitor.CharacterRaces.Elf.ElfFactory;
import org.example.visitor.CharacterRaces.Gnome.GnomeFactory;
import org.example.visitor.CharactersClasses.ClassFactory;
import org.example.visitor.Stats.Stats;
import org.example.visitor.visitor.ElementVisitor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ElementVisitor elementVisitor = new ElementVisitor();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();

        try {
            FileWriter fileWriter = new FileWriter("result.json");

            Character gnomeCharacter = new Character(
                    "AlexGnommy",
                    ClassFactory.getClass("Barbarian"),
                    new GnomeFactory().create());
            gnomeCharacter.setAttributes(Stats.generate());
            gnomeCharacter.addRaceBonuses();

            fileWriter.write("[");
            jsonObject = Demo.formJsonObject(gnomeCharacter,elementVisitor);
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.write(",");

            Character elfCharacter = new Character(
                    "Morti Stender",
                    ClassFactory.getClass("Druid"),
                    new ElfFactory().create());
            elfCharacter.setAttributes(Stats.generate());
            elfCharacter.addRaceBonuses();

            jsonObject = Demo.formJsonObject(elfCharacter,elementVisitor);
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.write("]");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException("It's not possible to create file 'result.json'");
        }
    }
    private static JSONObject formJsonObject(Character character,ElementVisitor elementVisitor){
        List<DataElement> dataElementList = new ArrayList<>();

        // add all objects that contain info about our character to list
        dataElementList.add(character);
        dataElementList.add(character.getCharacterClass());
        dataElementList.add(character.getRace());
        dataElementList.add(character.getAttributes());

        JSONObject jsonObject = new JSONObject();

        // get TreeMap from every object on the list
        for (DataElement element: dataElementList ) {
            jsonObject.putAll(element.accept(elementVisitor));
        }
        return jsonObject;
    }
}
