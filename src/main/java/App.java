import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Car;
import model.Color;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //GSON

        Car ferrari = new Car("Ferrari", 300, Color.RED);
        ferrari.getEngine().setPower(400);
        ferrari.getEngine().setCapacity(3000);

        Car lamborghini = new Car("Lamborghini", 299, Color.YELLOW);
        lamborghini.getEngine().setPower(720);
        lamborghini.getEngine().setCapacity(5600);

        Car fiat = new Car("Fiat", 140, Color.BLUE);
        fiat.getEngine().setPower(90);
        fiat.getEngine().setCapacity(1200);

        Car[] cars = {ferrari, lamborghini, fiat};
        List<Car> listOfCars = new ArrayList<>(List.of(cars));

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        // List of cars to JSON
        String carsToJson = gson.toJson(listOfCars);

        // JSON to list of cars
        TypeToken<List<Car>> type = new TypeToken<>(){};
        List<Car> fromJson = gson.fromJson(carsToJson, type.getType());

        System.out.println(fromJson);
        System.out.println(listOfCars.equals(fromJson));
    }
}
