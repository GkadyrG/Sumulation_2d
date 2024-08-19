package org.example;

import org.example.Action.Action;
import org.example.Action.EntityGenerationAction.*;

import java.util.ArrayList;
import java.util.List;

public class initWorld {
    public static void initialization(World world) {
        List<Action> initActions = new ArrayList<>();
        initActions.add(new GrassEntityGenerateAction());
        initActions.add(new HerbivoreEntityGenerateAction());
        initActions.add(new PredatorEntityGenerateAction());
        initActions.add(new RockEntityGenerateAction());
        initActions.add(new TreeEntityGenerateAction());
        for (Action action: initActions) {
            action.perform(world);
        }
    }
}