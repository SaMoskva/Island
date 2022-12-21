package ua.com.javarush.moskvitina.island.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ua.com.javarush.moskvitina.island.config.Setting;
import ua.com.javarush.moskvitina.island.entity.Game;

@RequiredArgsConstructor
public class GameWorker extends Thread{
    public static final int CORE_POOL_SIZE = 4;
    private final Game game;
    private final int PERIOD = Setting.get().getPeriod();

    @Override
    public void run() {
        super.run();
    }
}