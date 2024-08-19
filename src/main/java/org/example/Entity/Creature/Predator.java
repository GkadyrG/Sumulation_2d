package org.example.Entity.Creature;

import org.example.Coordinate;
import org.example.Entity.Entity;
import org.example.Entity.Stationary.Grass;
import org.example.findPath;

import java.util.*;

public class Predator extends Creature {


    @Override
    public void makeMove(Map<Coordinate, Entity> map) {
        Queue<Coordinate> path = this.findNearHerbivore(map);
        if (path != null) {
            while(!path.isEmpty()) {
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
        for (Map.Entry<Coordinate,Entity> entry: map.entrySet()) {
            if (entry.getValue() instanceof Herbivore) {
                queueList.add(findPath.findShortestPath(map,this.getCoordinate(),entry.getKey()));
            }
        }

        return queueList.stream()
                .min(Comparator.comparingInt(Queue::size))
                .orElse(null);
    }

    private void swapCoordinates(Map<Coordinate, Entity> map, Coordinate start, Coordinate end) {
        Entity tempEntity = map.get(start);
        map.put(start,map.get(end));
        map.put(end,tempEntity);
    }

    private void eating(Map<Coordinate, Entity> map, Coordinate start, Coordinate end) {
        Entity tempEntity = map.get(start);
        map.put(start,new Grass());
        map.put(end,tempEntity);
    }


    @Override
    public String toString() {
        return "🦊";
    }
}
