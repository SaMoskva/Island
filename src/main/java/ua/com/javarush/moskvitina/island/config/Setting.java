package ua.com.javarush.moskvitina.island.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous.*;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.predators.*;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter(AccessLevel.PROTECTED)
public class Setting {
    public static final String YAML_SETTINGS = "moskvitina/settings.yaml";
    public static final Class<?>[] TYPES = {
            Boar.class, Buffalo.class, Caterpillar.class, Deer.class, Duck.class, Goat.class,
            Horse.class, Mouse.class, Rabbit.class, Sheep.class, Bear.class, Boa.class,
            Eagle.class, Fox.class, Wolf.class};
    public static final Organism[] ANIMALS = EntityScanner.createAnimal(TYPES);

    private static volatile Setting SETTING;

    private int period;
    private int rows;
    private int columns;

    private int animalSlimPercent;
    private int plantGrowPercent;

    private Map<String, Map<String, Integer>> food = new LinkedHashMap<>();

    public static Setting get() {
        Setting setting = SETTING;
        if(Objects.isNull(setting)){
            synchronized (Setting.class){
                if(Objects.isNull(setting = SETTING)) {
                    setting = SETTING = new Setting();
                }
            }
        }
        return setting;
    }

    private Setting() {
        loadFromDefaultSettings();
        updateFromYaml();
    }

    private void loadFromDefaultSettings(){
        period = DefaultSettings.PERIOD;

        rows = DefaultSettings.ROWS;
        columns = DefaultSettings.COLUMNS;

        animalSlimPercent = DefaultSettings.ANIMAL_SLIM_PERCENT;
        plantGrowPercent = DefaultSettings.PLANT_GROW_PERCENT;

        for (int i = 0, x = DefaultSettings.names.length; i < x; i++) {
            String key = DefaultSettings.names[i];
            this.food.putIfAbsent(key, new LinkedHashMap<>());
            for (int j = 0; j < x; j++) {
                int ratio = DefaultSettings.setProbability[i][j];
                if(ratio > 0){
                    this.food.get(key).put(DefaultSettings.names[j], ratio);
                }
            }
        }
    }

    @SneakyThrows
    private void updateFromYaml() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        ObjectReader reader = mapper.readerForUpdating(this);
        URL resource = Setting.class.getClassLoader().getResource(YAML_SETTINGS);
        if(Objects.nonNull(resource)){
            reader.readValue(resource.openStream());
        }
    }

    @Override
    public String toString() {
        ObjectMapper yaml = new ObjectMapper(new YAMLFactory());
        yaml.enable(SerializationFeature.INDENT_OUTPUT);
        try{
            return yaml.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}