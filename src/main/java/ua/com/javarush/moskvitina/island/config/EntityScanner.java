package ua.com.javarush.moskvitina.island.config;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EntityScanner {
    private EntityScanner(){};

    public static Organism[] createAnimal(Class<?>[] TYPES) {
        Organism[] organisms = new Organism[TYPES.length];
        int index = 0;
        for (Class<?> type : TYPES) {
            if (type.isAnnotationPresent(SpeciesData.class)) {
                SpeciesData typeData = type.getAnnotation(SpeciesData.class);
                String name = typeData.name();
                String icon = typeData.icon();
                MaxValue max = new MaxValue(
                        typeData.maxQuantityOnCell(),
                        typeData.maxSpeed(),
                        typeData.maxWeight(),
                        typeData.maxFoodNeeded()
                );

                organisms[index++] = generateObject(type, name, icon, max);
            }
        }
        return organisms;
    }

    private static Organism generateObject(Class<?> type, String name, String icon, MaxValue max) {
        try {
            Constructor<?> constructor = type.getConstructor(String.class, String.class, MaxValue.class);
            return (Organism) constructor.newInstance(name, icon, max);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
