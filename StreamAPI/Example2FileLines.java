package StreamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example2FileLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/Sakil Laskar/Desktop/GID.txt");

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
