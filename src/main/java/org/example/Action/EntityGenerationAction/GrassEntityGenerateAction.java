package org.example.Action.EntityGenerationAction;

import org.example.Action.EntityGenerationAction.EntityGenerationAction;
import org.example.Entity.Stationary.Grass;

public class GrassEntityGenerateAction extends EntityGenerationAction {
    private double spawnRate = 0.3;

    @Override
    public Grass createEntity() {
        return new Grass();
    }
}
