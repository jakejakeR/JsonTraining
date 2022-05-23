import services.FileHandler;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        try {
            System.out.println(FileHandler.readFile("file.txt"));
        } catch(IOException ex) {
            System.out.println("File doesn't exist");
        }

        try {
            FileHandler.writeToFile("file.txt", "Text added by using FileHandler");
        } catch (IOException ex) {
            System.out.println("File doesn't exist");
        }
    }
}
