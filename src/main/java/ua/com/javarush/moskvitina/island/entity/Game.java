package ua.com.javarush.moskvitina.island.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ua.com.javarush.moskvitina.island.entity.map.GameMap;
import ua.com.javarush.moskvitina.island.repository.Factory;
import ua.com.javarush.moskvitina.island.view.View;

@Getter
@RequiredArgsConstructor
public class Game {
    private final GameMap gameMap;
    private final Factory entityFactory;
    private final View view;
}
