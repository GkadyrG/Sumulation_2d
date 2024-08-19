package org.example.Action;

import org.example.Coordinate;
import org.example.Entity.Creature.Creature;
import org.example.World;

public class makeCreaturesAction extends  Action {
    @Override
    public void perform(World world) {
        for (int i = 0; i < world.getSize(); i++) {
            for (int j = 0; j < world.getSize(); j++) {
                if (world.getMap(new Coordinate(i,j)) instanceof Creature) {
                    ((Creature) world.getMap(new Coordinate(i,j))).makeMove(world.getMap());
                }
            }
        }
    }
}
