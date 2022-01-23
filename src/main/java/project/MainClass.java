package project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        try {
            Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\Andrey\\IdeaProjects\\Task11A3"));
            paths.filter(Files::isRegularFile).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
