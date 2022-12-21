package ua.com.javarush.moskvitina.island.repository;

import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;

import java.util.List;

public interface Factory {
    Cell createRandomCell(boolean empty);

    List<Organism> getAllSpecies();
}
