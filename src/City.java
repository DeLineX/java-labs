import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class City {
    private final Map<City, Integer> paths = new HashMap<>();
    String name;

    public City(String name) {
        this.name = name;
    }

    public Map<City, Integer> getPaths() {
        return paths;
    }

    public void addPath(@NotNull City city, Integer cost) {
        paths.put(city, cost);
    }

    @Override
    public String toString() {
        if (paths.isEmpty()) return String.format("Город %s, связанных городов нет", name);

        String linkedCitiesStr = paths.entrySet().stream()
                .map(p -> String.format("%s - %d", p.getKey().name, p.getValue()))
                .collect(Collectors.joining(", "));

        return String.format("Город %s, связанные города: %s", name, linkedCitiesStr);
    }
}
