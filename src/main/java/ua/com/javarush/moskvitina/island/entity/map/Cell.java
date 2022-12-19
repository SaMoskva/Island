package ua.com.javarush.moskvitina.island.entity.map;

import ua.com.javarush.moskvitina.island.util.Randomizer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Cell {
    private final List<Cell> nextCell = new ArrayList<>();
    private final Lock lock = new ReentrantLock();
    private final Creatures creatures = new Creatures(this);

    public Lock getLock() {
        return lock;
    }

    public Creatures getCreatures() {
        return creatures;
    }

    public void updateNextCell(GameMap map, int row, int column) {
        Cell[][] cells = map.getCells();
        if(row > 0) {
            nextCell.add(cells[row - 1][column]);
        }
        if (column > 0) {
            nextCell.add(cells[row][column - 1]);
        }
        if(row < map.getRows() - 1) {
            nextCell.add(cells[row + 1][column]);
        }
        if(column < map.getColumns()) {
            nextCell.add(cells[row][column + 1]);
        }
    }

    public Cell getNextCell(int steps) {
        Set<Cell> visitedCells = new HashSet<>();
        Cell currentCell = this;
        while(visitedCells.size() < steps){
            List<Cell> nextCells = currentCell
                    .nextCell
                    .stream()
                    .filter(cell -> !visitedCells.contains(cell)).collect(Collectors.toList());
            int directionCount = nextCells.size();
            if(directionCount > 0) {
                int index = Randomizer.getRandomValue(0, directionCount);
                currentCell = nextCells.get(nextCells.size() - 1 - index);
                visitedCells.add(currentCell);
            } else {
                break;
            }
        }
        return currentCell;
    }

    public int getNextCellCount() {
        return nextCell.size();
    }
}