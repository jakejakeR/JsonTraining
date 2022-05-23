import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Path resourcesPath = Path.of("src", "main", "resources", "file.txt");
        Scanner sc = new Scanner(System.in);
        StringBuilder userInput = new StringBuilder();

        System.out.println("User input: ");

        while(!userInput.toString().contains("#")) {
            userInput.append(sc.nextLine());
            userInput.append("\r\n");
        }

        userInput.delete(userInput.indexOf("#"), userInput.length());

        String input = userInput.toString();

        System.out.println(input);
        System.out.println("Hello");

        Files.writeString(resourcesPath, input);

    }
}
