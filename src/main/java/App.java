import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Car;
import model.Color;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

        Car ferrari = new Car("Ferrari");
        ferrari.setMaxSpeed(300);
        ferrari.getEngine().setCapacity(5000);
        ferrari.getEngine().setPower(400);
        ferrari.setColor(Color.RED);

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

        String ferrariJson = objectWriter.writeValueAsString(ferrari);
        System.out.println(ferrariJson);

        Car ferrariFromJson = objectMapper.readValue(ferrariJson, Car.class);

        System.out.println(ferrariFromJson);
        System.out.println(ferrari.equals(ferrariFromJson));

    }
}
