package ua.com.javarush.moskvitina.island.repository;

import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.entity.map.GameMap;

public class MapCreator {
    private final Factory factory;

    public MapCreator(Factory factory) {
        this.factory = factory;
    }

    public GameMap createRandomMap (int rows, int columns){
        return createRandomMap(rows, columns, false);
    }

    public GameMap createRandomMap(int rows, int columns, boolean empty){
        GameMap gameMap = new GameMap(rows, columns);
        Cell[][] cells = gameMap.getCells();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = factory.createRandomCell(empty);
            }
        }

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].updateNextCell(gameMap, i, j);
            }
        }
        return gameMap;
    }
}
