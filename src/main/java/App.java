import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

        String lamborghiniJson = objectMapper.writeValueAsString(lamborghini);

        System.out.println(lamborghini);
        System.out.println(lamborghiniJson);

    }
}
