package org.example;

public class Renderer {
    public static void Render(World world) {
        for (int row = 0; row < world.getSize(); row++) {
            for (int col = 0; col < world.getSize(); col++) {
                System.out.print(world.getEntityFromMap(new Coordinate(row,col)) + " ");
            }
            System.out.println("\n");
        }
    }
}
