package ua.com.javarush.moskvitina.island.repository;

import ua.com.javarush.moskvitina.island.config.Setting;
import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.entity.map.Creatures;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;
import ua.com.javarush.moskvitina.island.entity.organisms.Organisms;
import ua.com.javarush.moskvitina.island.util.Randomizer;

import java.util.Arrays;
import java.util.List;

public class EntityFactory implements Factory{
    public static final int PERCENT_FILL = 33;
    public static final int BIRTH_PROBABILITY = 50;

    @Override
    public Cell createRandomCell(boolean empty) {
        Cell cell = new Cell();
        Creatures residents = cell.getCreatures();
        boolean fill = Randomizer.getRandomValue(PERCENT_FILL);
        if (fill && !empty) {
            for (Organism animal : Setting.ANIMALS) {
                String type = animal.getType();
                boolean born = Randomizer.getRandomValue(BIRTH_PROBABILITY);
                if (born) {
                    Organisms organisms = residents.get(type);
                    int currentCount = organisms.size();
                    int max = animal.getMaxValue().getMaxQuantityOnCell() - currentCount;
                    int count = Randomizer.getRandomValue(0, max);
                    for (int i = 0; i < count; i++) {
                        organisms.add(Organism.clone(animal));
                    }
                }
            }
        }
        return cell;
    }

    @Override
    public List<Organism> getAllSpecies() {
        return Arrays.asList(Setting.ANIMALS);
    }

    @Override
    public String toString() {
        return "EntityFactory{" + "animals=" + Arrays.toString(Setting.ANIMALS) + '}';
    }
}