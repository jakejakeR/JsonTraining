import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Car;
import model.Color;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

        // Task 23b
        Car ferrari = new Car("Ferrari", 300, Color.RED);
        ferrari.getEngine().setPower(400);
        ferrari.getEngine().setCapacity(3000);

        Car lamborghini = new Car("Lamborghini", 299, Color.YELLOW);
        lamborghini.getEngine().setPower(720);
        lamborghini.getEngine().setCapacity(5600);

        Car fiat = new Car("Fiat", 140, Color.BLUE);
        fiat.getEngine().setPower(90);
        fiat.getEngine().setCapacity(1200);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(ferrari);
        cars.add(lamborghini);
        cars.add(fiat);

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

        String carsToJson = objectWriter.writeValueAsString(cars);
        System.out.println(carsToJson);

        TypeReference<ArrayList<Car>> arrayListTypeReference = new TypeReference<>() {};
        ArrayList<Car> carsFromJson = objectMapper.readValue(carsToJson, arrayListTypeReference);

        for (Car car : carsFromJson) {
            System.out.println(car);
        }

        System.out.println(cars.equals(carsFromJson));
    }
}
