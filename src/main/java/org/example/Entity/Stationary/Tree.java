package org.example.Entity.Stationary;

import org.example.Coordinate;
import org.example.Entity.Entity;

public class Tree extends Entity {
    public  Tree() {}
    public Tree(Coordinate coordinate) {
        setCoordinate(coordinate);
    }

    @Override
    public String toString() {
        return "🌲";
    }
}
