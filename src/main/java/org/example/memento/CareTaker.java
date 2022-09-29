package org.example.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    private static int mementoID = 0;

    public void add(Memento memento){
        mementoList.add(mementoID,memento);
        mementoID++;
    }
    public Memento get(int index){
        return  mementoList.get(index);
    }
}
