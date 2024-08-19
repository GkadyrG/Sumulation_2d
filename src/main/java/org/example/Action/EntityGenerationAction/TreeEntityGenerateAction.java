package org.example.Action.EntityGenerationAction;

import org.example.Action.EntityGenerationAction.EntityGenerationAction;
import org.example.Entity.Stationary.Tree;

public class TreeEntityGenerateAction extends EntityGenerationAction {
    private double spawnRate = 0.1;

    @Override
    public Tree createEntity() {
        return new Tree();
    }
}
