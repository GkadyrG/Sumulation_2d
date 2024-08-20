package org.example.Entity.Stationary;

import org.example.Coordinate;
import org.example.Entity.Entity;

public class Rock extends Entity {

    public  Rock() {}
    public Rock(Coordinate coordinate) {
        setCoordinate(coordinate);
    }

    @Override
    public String toString() {
        return "⚫";
    }
}
