package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LessonHandler {

    public int getNumberOfLessonsFromFileByTeacher(String teacher, String pathString) {
        int numberOfLessons = 0;
        String line;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(pathString))) {
            while ((line = reader.readLine()) != null) {
                reader.readLine();
                reader.readLine();
                if (line.equals(teacher)) {
                    numberOfLessons += Integer.parseInt(reader.readLine());
                } else {
                    reader.readLine();
                }
            }
            return numberOfLessons;
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }
}