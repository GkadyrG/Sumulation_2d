package org.example.Action;

import org.example.Coordinate;
import org.example.Entity.Creature.Herbivore;
import org.example.Entity.Creature.Predator;
import org.example.Entity.Entity;
import org.example.Entity.Stationary.Grass;
import org.example.Entity.Stationary.Rock;
import org.example.Entity.Stationary.Tree;

import java.util.Random;

public class EntityGenerateAction {
    public static Entity createRandomEntity(Coordinate coordinate) {
        // Определяем вероятности для каждого типа сущностей
        double grassProbability = 0.3; // 50%
        double rockProbability = 0.3; // 30%
        double treeProbability = 0.25; // 15%
        double herbivoreProbaility = 0.1; // 3%
        double predatorProbability = 0.05; // 2%

        // Генерируем случайное число от 0 до 1
        Random random = new Random();
        double randomValue = random.nextDouble();

        // Выбираем тип сущности в соответствии с вероятностями
        if (randomValue < grassProbability) {
            return new Grass(coordinate);
        } else if (randomValue < grassProbability + rockProbability) {
            return new Rock(coordinate);
        } else if (randomValue < grassProbability + rockProbability + treeProbability) {
            return new Tree(coordinate);
        } else if (randomValue < grassProbability + rockProbability + treeProbability + herbivoreProbaility) {
            return new Herbivore(coordinate);
        } else {
            return new Predator(coordinate);
        }
    }

}
