package org.example.visitor;

import org.example.visitor.visitor.DataElementsVisitor;

import java.util.TreeMap;

public interface DataElement {
    public TreeMap accept(DataElementsVisitor elementsVisitor);
}
