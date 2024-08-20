package org.example;

import org.example.Entity.Creature.Herbivore;
import org.example.Entity.Creature.Predator;
import org.example.Entity.Entity;
import org.example.Entity.Stationary.Grass;
import org.example.Entity.Stationary.Rock;

import java.util.HashMap;
import java.util.Map;

public class World {
    private static final int SIZE = 7;
    private final Map<Coordinate, Entity> map = new HashMap<>();

    public Entity getEntityFromMap(Coordinate coordinate) {
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

    public boolean  checkHavePredatorsAndHerbivore() {
        boolean flag1 = false;
        boolean flag2 = false;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (map.get(new Coordinate(row,col)) instanceof Predator ) {
                    flag1 = true;
                }

                if (map.get(new Coordinate(row,col)) instanceof Herbivore) {
                    flag2 = true;
                }
            }
        }
        return flag1&&flag2;
    }

    public int getSize() {
        return SIZE;
    }
}
