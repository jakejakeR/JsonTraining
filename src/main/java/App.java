import java.nio.file.Path;

public class App {
    public static void main(String[] args) {

        Path myPath = Path.of("src", "main", "java", "resources", "file.txt");

        System.out.println(myPath);
        System.out.println(myPath.toAbsolutePath());

    }
}
