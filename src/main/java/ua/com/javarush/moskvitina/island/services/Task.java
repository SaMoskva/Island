package ua.com.javarush.moskvitina.island.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.Animal;

@Getter
@RequiredArgsConstructor
public class Task {
    private final Organism organism;
    private final Cell cell;

    public void doTask() {
        if(organism instanceof Animal) {
            if(((Animal) organism).eat()) { //TODO add cell as a parameter
                ((Animal) organism).spawn(); //TODO add cell as a parameter
            }
            ((Animal) organism).move(); //TODO add cell as a parameter
        } else {
            ((Animal) organism).spawn(); //TODO add cell as a parameter
        }
    }
}
