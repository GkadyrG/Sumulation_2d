package org.example.Action.EntityGenerationAction;

import org.example.Action.EntityGenerationAction.EntityGenerationAction;
import org.example.Entity.Stationary.Rock;

public class RockEntityGenerateAction extends EntityGenerationAction {
    private double spawnRate = 0.1;

    @Override
    public Rock createEntity() {
        return new Rock();
    }
}
