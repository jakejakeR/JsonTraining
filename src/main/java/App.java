import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Engine;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        Engine engine = new Engine();
        engine.setPower(100);
        engine.setCapacity(1000);

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

        String engineJson = objectWriter.writeValueAsString(engine);
        System.out.println(engineJson);

        Engine engineFromJson = objectMapper.readValue(engineJson, Engine.class);
        System.out.println(engineFromJson);
        System.out.println(engine.equals(engineFromJson));
    }
}
