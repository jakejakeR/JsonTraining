package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    private FileHandler() {
        throw new IllegalStateException("Utility class");
    }

    public static String readFile(String name) throws IOException {
        Path path = Path.of("src", "main", "resources", name);
        return Files.readString(path);
    }

    public static void writeToFile(String name, String value) throws IOException {
        Path path = Path.of("src", "main", "resources", name);
        StringBuilder stringBuilder = new StringBuilder(readFile(name));
        Files.writeString(path, stringBuilder.append("\r\n").append(value).toString());
    }
}
