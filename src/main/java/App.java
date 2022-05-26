import com.google.gson.reflect.TypeToken;
import model.Car;
import model.Color;
import services.JsonHandler;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Task 25*
        Car ferrari = new Car("Ferrari", 300, Color.RED);
        ferrari.getEngine().setPower(400);
        ferrari.getEngine().setCapacity(3000);

        Car lamborghini = new Car("Lamborghini", 299, Color.YELLOW);
        lamborghini.getEngine().setPower(720);
        lamborghini.getEngine().setCapacity(5600);

        Car fiat = new Car("Fiat", 140, Color.BLUE);
        fiat.getEngine().setPower(90);
        fiat.getEngine().setCapacity(1200);

        Car[] arrayOfCars = {ferrari, lamborghini, fiat};
        List<Car> cars = new ArrayList<>(List.of(arrayOfCars));

        Path jsonPath = Path.of("src", "main", "resources", "cars.json");

        JsonHandler.saveToJson(cars, jsonPath);

        // How to parametrize readFromJson with type?
        TypeToken<List<Car>> carListToken = new TypeToken<>() {};

        List<?> carsFromJson = JsonHandler.readFromJson(jsonPath, carListToken);
        System.out.println(cars.equals(carsFromJson));

    }
}
