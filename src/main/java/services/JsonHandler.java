package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Car;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JsonHandler {

    private static final GsonBuilder gsonBuilder = new GsonBuilder();

    private JsonHandler() {
        throw new IllegalStateException("Utility class");
    }

    private static Gson initializeGson() {
        gsonBuilder.setPrettyPrinting();
        return gsonBuilder.create();
    }

    public static void saveToJson(Object object, Path path) {

        String objectToJson = initializeGson().toJson(object);
        try {
            Files.writeString(path, objectToJson);
        } catch(IOException e) {
            System.out.println("File not found.");
        }

    }

    public static List<Car> readFromJson(Path path) {

        List<Car> listFromJson = new ArrayList<>();

        try {
            TypeToken<List<Car>> type = new TypeToken<>() {
            };
            Reader fromJasonReader = Files.newBufferedReader(path);
            listFromJson = initializeGson().fromJson(fromJasonReader, type.getType());
            fromJasonReader.close();
        } catch (IOException e) {
            System.out.println("File not found.");
        }

        return listFromJson;
    }

}
