import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws IOException {

        Path appPath = Path.of("src", "main", "java", "App.java");
        Path resourcesPath = Path.of("src", "main", "resources", "classApp.txt");

        String copyText = Files.readString(appPath);
        System.out.println(copyText);

        Files.writeString(resourcesPath, copyText);

    }
}
