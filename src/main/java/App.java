import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Car;
import model.Color;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

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

        // Obj to JSON
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String carToJson = gson.toJson(ferrari);
        System.out.println(carToJson);

        // JSON to obj
        Car carFromJson = gson.fromJson(carToJson, Car.class);
        System.out.println(carFromJson);
        System.out.println(ferrari.equals(carFromJson));


    }
}
