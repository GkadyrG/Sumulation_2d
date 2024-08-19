package org.example.Action.EntityGenerationAction;

import org.example.Action.EntityGenerationAction.EntityGenerationAction;
import org.example.Entity.Creature.Predator;

public class PredatorEntityGenerateAction extends EntityGenerationAction {
    private double spawnRate = 0.2;

    @Override
    public Predator createEntity() {
        return new Predator();
    }
}
