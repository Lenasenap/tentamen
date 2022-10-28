package taskfive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Car> cars;
    private static ObjectMapper mapper;

    private static void createCars() {
        Car car1 = new Car("Blå", "Volvo");
        System.out.println(Car.getNumberOfCars());
        Car car2 = new Car("Röd", "Tesla");
        System.out.println(Car.getNumberOfCars());
        Car car3 = new Car("Svart", "Saab");
        System.out.println(Car.getNumberOfCars());
        Car car4 = new Car("Gul", "Skoda");
        System.out.println(Car.getNumberOfCars());

        cars = new ArrayList<>(List.of(car1, car2, car3, car4));
    }
    private static void saveCarsToJSON() throws IOException {
        mapper.writeValue(Paths.get("src/main/resources/cars.json").toFile(), cars);

    }
    public static void main(String[] args) throws IOException {
        mapper = new ObjectMapper();
        createCars();
        saveCarsToJSON();
    }
}
