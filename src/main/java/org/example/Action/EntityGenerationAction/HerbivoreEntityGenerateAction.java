package org.example.Action.EntityGenerationAction;

import org.example.Action.EntityGenerationAction.EntityGenerationAction;
import org.example.Entity.Creature.Herbivore;

public class HerbivoreEntityGenerateAction extends EntityGenerationAction {
    private double spawnRate = 0.3;

    @Override
    public Herbivore createEntity() {
        return new Herbivore();
    }
}
