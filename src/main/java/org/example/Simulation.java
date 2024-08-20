package org.example;

import org.example.Action.makeCreaturesAction;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        simulation();
    }

    public static void simulation() {
        World world = new World();
        initWorld.initialization(world);
        print(world);
        sentence();
        int value = 404;
        while (value != 0 ) {
            if (!world.checkHavePredatorsAndHerbivore()) {
                System.out.println();
                System.out.println("-Хищники вымерли или начали вымирать. Конец симуляции");
                break;
            }
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
            switch (value) {
                case 0:
                    break;
                case 1:
                    makeCreaturesAction.onePerform(world);
                    print(world);
                    sentence();
                    break;
                case 2:
                    makeCreaturesAction.allPerform(world);
                    print(world);
                    sentence();
                    break;
            }
        }
    }

    public static void print(World world) {
        Renderer.Render(world);
        System.out.println();
        System.out.println();
    }

    public static void sentence() {
        System.out.println("Введите:\n" +
                "0 - Выйти из симуляции\n" +
                "1 - Сходить одним хищником для охоты на жертву\n" +
                "2 - Сходить всеми хищниками, пока жертв не останется или хищники не умрут от голода");
    }
}
