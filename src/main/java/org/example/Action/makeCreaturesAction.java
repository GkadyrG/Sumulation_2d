package org.example.Action;

import org.example.Coordinate;
import org.example.Entity.Creature.Creature;
import org.example.Entity.Creature.Predator;
import org.example.World;

public class makeCreaturesAction {
    public static void allPerform(World world) {
        for (int i = 0; i < world.getSize(); i++) {
            for (int j = 0; j < world.getSize(); j++) {
                if (world.getEntityFromMap(new Coordinate(i,j)) instanceof Predator) {
                    ((Creature) world.getEntityFromMap(new Coordinate(i,j))).makeMove(world.getMap());
                }

            }
        }
    }

    public static void onePerform(World world) {
        boolean flag = true;
        for (int i = 0; i < world.getSize() && flag; i++) {
            for (int j = 0; j < world.getSize() && flag; j++) {
                if (world.getEntityFromMap(new Coordinate(i,j)) instanceof Predator) {
                    ((Creature) world.getEntityFromMap(new Coordinate(i,j))).makeMove(world.getMap());
                    flag = false;

                }

            }
        }
    }
}
