package org.example;

import org.example.Entity.Entity;

import java.util.*;

public class findPath {

    public static Queue<Coordinate> findShortestPath(Map<Coordinate, Entity> map, Coordinate coordinateStart, Coordinate coordinateFinish) {
        Queue<Coordinate> queue = new LinkedList<>();
        Map<Coordinate, Coordinate>  parents = new HashMap<>();
        Set<Coordinate> visited = new HashSet<>();
        queue.offer(coordinateStart);
        visited.add(coordinateStart);

        while(!queue.isEmpty()) {
            Coordinate currentCoordinate = queue.remove();
            if (currentCoordinate.equals(coordinateFinish)) {
                return reconstructPath(parents, coordinateStart, coordinateFinish);
            }
            for (Coordinate neighbor: getValidNeighbors(map, currentCoordinate)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parents.put(neighbor, currentCoordinate);
                    queue.offer(neighbor);
                }
            }
        }
        return null;
    }


    private static Queue<Coordinate> reconstructPath(Map<Coordinate, Coordinate> parents, Coordinate start, Coordinate end) {
        Queue<Coordinate> path = new LinkedList<>();
        Coordinate current = end;

        while(!current.equals(start)) {
            path.offer(current);
            current = parents.get(current);
        }

        path.offer(start);
        path = reverse(path);
        return path;
    }

    private static <T> Queue<T> reverse(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }

    private static List<Coordinate> getValidNeighbors(Map<Coordinate,Entity> map, Coordinate coordinate) {
        List<Coordinate> neighbors = new ArrayList<>();
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        for (int i = 0; i < 4; i++) {
            int newX = coordinate.getX() + dx[i];
            int newY = coordinate.getY() + dy[i];
            Coordinate neighbor = new Coordinate(newX, newY);
            if (map.containsKey(neighbor)) {
                neighbors.add(neighbor);
            }
        }
        return neighbors;
    }

}
