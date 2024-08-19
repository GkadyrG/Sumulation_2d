package org.example.Action.EntityGenerationAction;

import org.example.Action.Action;
import org.example.Coordinate;
import org.example.Entity.Entity;
import org.example.World;

import java.util.Random;

public abstract class EntityGenerationAction<T extends Entity> extends Action {
    private double spawnRate;
    private double rate = 0;

    @Override
    public void perform(World world) {
        while (rate < spawnRate) {
            rate += world.getSize()/100.0;
            Coordinate coordinate = Coordinate.getRandomEmptyCoordinates(world);
            if (coordinate != null)
                world.setMap(coordinate,createEntity());
        }
    }

    abstract T createEntity();
}
