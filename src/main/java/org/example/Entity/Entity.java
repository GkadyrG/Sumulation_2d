package org.example.Entity;

import org.example.Coordinate;

public abstract class Entity {

    private Coordinate coordinate;

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
