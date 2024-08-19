package org.example;

import org.example.Action.Action;
import org.example.Action.EntityGenerationAction.GrassEntityGenerateAction;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
       World world = new World();
       initWorld.initialization(world);
       Renderer.Render(world);
    }
}
