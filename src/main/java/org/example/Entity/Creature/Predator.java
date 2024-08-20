package org.example.Entity.Creature;

import org.example.Coordinate;
import org.example.Entity.Entity;
import org.example.Entity.Stationary.Grass;
import org.example.Renderer;
import org.example.findPath;

import java.util.*;

public class Predator extends Creature {
    public  Predator() {}
    public Predator(Coordinate coordinate) {
        setCoordinate(coordinate);
    }

    @Override
    public void makeMove(Map<Coordinate, Entity> map) {
        Queue<Coordinate> path = this.findNearHerbivore(map);
        if (path != null) {
            while(!path.isEmpty()) {
                if (checkHP(map)) {
                    break;
                }
                if (map.get(path.peek()) instanceof Herbivore) {
                    eating(map,this.getCoordinate(),path.remove());
                }
                else {
                    swapCoordinates(map,this.getCoordinate(),path.remove());
                }
            }
        }

    }


    private Queue<Coordinate> findNearHerbivore(Map<Coordinate, Entity> map) {
        List<Queue<Coordinate>> queueList = new ArrayList<>();
        for (Map.Entry<Coordinate, Entity> entry : map.entrySet()) {
            if (entry.getValue() instanceof Herbivore) {
                Queue<Coordinate> path = findPath.findShortestPath(map, this.getCoordinate(), entry.getKey());
                if (path != null) {
                    queueList.add(path);
                }
            }
        }


        if (!queueList.isEmpty()) {
            return queueList.stream()
                    .min(Comparator.comparingInt(Queue::size))
                    .orElse(null);
        } else {
            return null;
        }

    }


    private void swapCoordinates(Map<Coordinate, Entity> map, Coordinate start, Coordinate end) {
        Entity startEntity = map.get(start);

        Entity endEntity = map.get(end);

        startEntity.setCoordinate(end);
        endEntity.setCoordinate(start);

        map.put(start, endEntity);
        map.put(end, startEntity);

        this.setHP(this.getHP() - 10);
    }




    private void eating(Map<Coordinate, Entity> map, Coordinate start, Coordinate end) {
        this.setCoordinate(end);

        this.setHP(this.getHP() + 10);

        map.put(end, this);

        map.put(start, new Grass(start));
    }



    private boolean checkHP(Map<Coordinate, Entity> map) {
        if (this.getHP() == 0) {
            map.put(this.getCoordinate(), new Grass(this.getCoordinate()));
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "🦊";
    }
}
