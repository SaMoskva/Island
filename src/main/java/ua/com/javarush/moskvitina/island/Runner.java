package ua.com.javarush.moskvitina.island;

import ua.com.javarush.moskvitina.island.config.EntityScanner;
import ua.com.javarush.moskvitina.island.config.Setting;
import ua.com.javarush.moskvitina.island.entity.Game;
import ua.com.javarush.moskvitina.island.entity.map.GameMap;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous.*;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.predators.*;
import ua.com.javarush.moskvitina.island.repository.EntityFactory;
import ua.com.javarush.moskvitina.island.repository.MapCreator;
import ua.com.javarush.moskvitina.island.services.GameWorker;
import ua.com.javarush.moskvitina.island.view.ConsoleView;
import ua.com.javarush.moskvitina.island.view.View;

public class Runner {
    public static void main(String[] args) {
        EntityFactory entityFactory = new EntityFactory();
        MapCreator mapCreator = new MapCreator(entityFactory);
        int rows = Setting.get().getRows();
        int columns = Setting.get().getColumns();
        GameMap gameMap = mapCreator.createRandomMap(rows, columns, false);
        View view = new ConsoleView(gameMap);
        Game game = new Game(gameMap, entityFactory, view);
        GameWorker gameWorker = new GameWorker(game);
        gameWorker.start();
    }
}

