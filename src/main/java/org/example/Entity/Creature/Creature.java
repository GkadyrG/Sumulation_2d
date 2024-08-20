package org.example.Entity.Creature;

import org.example.Coordinate;
import org.example.Entity.Entity;

import java.util.Map;

public abstract class Creature extends Entity {
    private int HP = 510;
    private final static int SPEED = 1;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getSPEED() {
        return SPEED;
    }

    public abstract void makeMove(Map<Coordinate,Entity> map);
}
