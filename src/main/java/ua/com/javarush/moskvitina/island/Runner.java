package ua.com.javarush.moskvitina.island;

import ua.com.javarush.moskvitina.island.entity.organisms.Organism;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous.*;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.predators.*;

public class Runner {
    public static void main(String[] args) {
        Class<?>[] TYPES = {
                Boar.class, Buffalo.class, Caterpillar.class, Deer.class, Duck.class, Goat.class,
                Horse.class, Mouse.class, Rabbit.class, Sheep.class, Bear.class, Boa.class,
                Eagle.class, Fox.class, Wolf.class};

        Organism[] organisms = God.createAnimal(TYPES);

        for (Organism organism : organisms) {
            System.out.println(organism);
        }

        /*Cell cell = new Cell(20, 100);
        int randomInt = Randomizer.getRandomValue(10, 500);
        double randomDouble = Randomizer.getRandomValue(10.5, 78.94);
        System.out.println("Пробую вывести рандомное целое число, зная максимальное и минимальное значение");
        System.out.println(randomInt);
        System.out.println("Пробую вывести рандомное целое число, зная максимальное и минимальное значение");
        System.out.println(randomDouble);

        Wolf wolf = new Wolf(Wolf.class.getAnnotation(SpeciesData.class).name(), Wolf.class.getAnnotation(SpeciesData.class).icon(), new MaxValue(
                Wolf.class.getAnnotation(SpeciesData.class).maxQuantityOnCell(),
                Wolf.class.getAnnotation(SpeciesData.class).maxSpeed(),
                Wolf.class.getAnnotation(SpeciesData.class).maxWeight(),
                Wolf.class.getAnnotation(SpeciesData.class).maxFoodNeeded()
        ));
        System.out.println(wolf);

        Boar boar = new Boar(Boar.class.getAnnotation(SpeciesData.class).name(), Boar.class.getAnnotation(SpeciesData.class).icon(), new MaxValue(
                Boar.class.getAnnotation(SpeciesData.class).maxQuantityOnCell(),
                Boar.class.getAnnotation(SpeciesData.class).maxSpeed(),
                Boar.class.getAnnotation(SpeciesData.class).maxWeight(),
                Boar.class.getAnnotation(SpeciesData.class).maxFoodNeeded()
        ));
        System.out.println(boar);*/
    }
}


