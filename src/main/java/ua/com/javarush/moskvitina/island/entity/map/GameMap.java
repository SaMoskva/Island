package ua.com.javarush.moskvitina.island.entity.map;

import ua.com.javarush.moskvitina.island.entity.organisms.Organisms;

import java.util.stream.Collectors;

public class GameMap {
    private final Cell[][] cells;

    public GameMap(int rows, int columns) {
        this.cells = new Cell[rows][columns];
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getRows() {
        return cells.length;
    }

    public int getColumns() {
        return cells[0].length;
    }

    public Organisms getAll() {
        Organisms all = new Organisms();
        for(Cell[] row : cells) {
            for (Cell cell : row) {
                all.addAll(cell.getCreatures()
                        .values()
                        .stream()
                        .flatMap(Organisms::stream)
                        .collect(Collectors.toSet()));
            }
        }
        return all;
    }
}