import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Car;
import model.Color;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        Car lamborghini = new Car("lamborghini");
        lamborghini.setColor(Color.YELLOW);
        lamborghini.setMaxSpeed(302);
        lamborghini.getEngine().setCapacity(6000);
        lamborghini.getEngine().setPower(800);

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

        String lamborghiniJson = objectWriter.writeValueAsString(lamborghini);

        System.out.println(lamborghini);
        System.out.println(lamborghiniJson);

        Car lamborghiniFromJson = objectMapper.readValue(lamborghiniJson, Car.class);
        System.out.println(lamborghini.equals(lamborghiniFromJson));
    }
}
