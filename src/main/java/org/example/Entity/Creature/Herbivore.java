package org.example.Entity.Creature;

import org.example.Coordinate;
import org.example.Entity.Entity;

import java.util.Map;

public class Herbivore extends Creature {


    @Override
    public void makeMove(Map<Coordinate,Entity> map) {

    }

    @Override
    public String toString() {
        return "🐔";
    }
}
