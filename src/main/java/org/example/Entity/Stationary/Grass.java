package org.example.Entity.Stationary;

import org.example.Coordinate;
import org.example.Entity.Entity;

public class Grass extends Entity {
    public  Grass() {}
    public Grass(Coordinate coordinate) {
        setCoordinate(coordinate);
    }
    @Override
    public String toString() {
        return "🍀";
    }
}
