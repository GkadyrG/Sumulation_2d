package org.example;

import org.example.Entity.Entity;
import org.example.Entity.Stationary.Grass;
import org.example.Entity.Stationary.Rock;

import java.util.HashMap;
import java.util.Map;

public class World {
    private static final int SIZE = 15;
    private final Map<Coordinate, Entity> map = new HashMap<>();

    public Entity getMap(Coordinate coordinate) {
        return map.get(coordinate);
    }

    public void setMap(Coordinate coordinate, Entity entity) {
        map.put(coordinate,entity);
    }

    public boolean checkFreeCoordinates(Coordinate coordinate) {
        return map.get(coordinate) instanceof Grass || map.get(coordinate) instanceof Rock;
    }

    public Map<Coordinate,Entity> getMap() {
        return map;
    }

    public int getSize() {
        return SIZE;
    }
}
