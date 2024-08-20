package org.example;

import org.example.Action.EntityGenerateAction;

public class initWorld {
    public static void initialization(World world) {
        for (int row = 0; row < world.getSize(); row++) {
            for (int col = 0; col < world.getSize(); col++) {
                world.setMap(new Coordinate(row,col), EntityGenerateAction.createRandomEntity(new Coordinate(row,col)));
            }
        }
    }
}
