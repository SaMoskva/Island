package ua.com.javarush.moskvitina.island.view;

import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.entity.map.Creatures;
import ua.com.javarush.moskvitina.island.entity.map.GameMap;

import java.util.*;

public class ConsoleView implements View{
    private final int rows;
    private final int columns;
    private final GameMap gameMap;

    public ConsoleView(GameMap gameMap) {
        this.gameMap = gameMap;

        rows = gameMap.getRows();
        columns = gameMap.getColumns();
    }

    @Override
    public String showStatistics() {
        Map<String, Double> initialStatistics = new HashMap<>();
        Map<String, Long> statistics = new TreeMap<>();
        Cell[][] cells = gameMap.getCells();
        for(Cell[] row : cells) {
            for(Cell cell : row) {
                Creatures creatures = cell.getCreatures();
                if(Objects.nonNull(creatures)) {
                    creatures.randomRotate();
                    creatures.values().
                            stream().filter(organisms -> organisms.size() > 0).
                            forEach(organisms -> {String icon = organisms.getIcon();
                                                  double quantity = organisms.size();
                                                  initialStatistics.put(icon, initialStatistics.getOrDefault(icon, 0D) + quantity);
                    });
                }
            }
        }
        initialStatistics.forEach((key, value) -> statistics.put(key, (long) Math.ceil(value)));
        System.out.println(statistics + "\n");
        return statistics.toString();
    }
}